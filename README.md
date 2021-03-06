# spring-cloud-demo

# 技术栈
  * eureka - 云端服务发现，一个基于 REST 的服务，用于定位服务，以实现云端中间层服务发现和故障转移
       * 1、提供服务发现的能力，各个微服务启动时，会向Eureka Server注册自己的信息(例如IP、端口、微服务名称等)，Eureka Server会存储这些信息
       * 2、微服务启动后，会周期性(默认30秒)向Eureka Server发送心跳，以续约自己"租期"。
       * 3、如果Eureka Server在一定时间内没有接收到某个服务实例心跳，将会注销该实例(默认90秒)
       * 4、多个Eureka Server实例通过复制方式，来实现服务注册表中的数据同步
       * 5、Eureka Client会缓存服务注册表中的信息
       * 6、@EnableEurekaClient表示Eureka的Client，@EnableDiscoveryClient表示服务发现组件的多种选择，例如zookeeper、Consul等
       * 7、使用DiscoveryClient.getInstances(serviceId),可查询指定微服务在Eureka上的实例列表
       * 8、Eureka自我保护模式：当网络分区发生故障时，微服务与Eureka无法通信，此时本不应该注销这个微服务。Eureka通过“自我保护模式”来解决这个问题当Eureka Server节点在短时间内丢失
            过多客户端时(可能发生了网络分区故障)，那么这个节点就会进入自我保护模式。一旦进入该模式，Eureka Server就会保护服务注册表中的信息，不再删除服务注册表中的数据(也就是不会注销任何微服务)。
            当网络故障恢复后，该Eureka Server节点会自动退出自我保护模式。
  * Spring Cloud Config - 配置管理工具包，让你可以把配置放到远程服务器，集中化管理集群配置，目前支持本地存储、Git 以及 Subversion
  * Feign - Feign是一种声明式、模板化的HTTP客户端,相当于micro-service-api
  * Spring Cloud Stream - Spring 数据流操作开发包，封装了与 Redis、Rabbit、Kafka 等发送接收消息
  * Spring Cloud OAuth2 - 基于 Spring Security 和 OAuth2 的安全工具包，为你的应用程序添加安全控制
  * Turbine - Turbine 是聚合服务器发送事件流数据的一个工具，用来监控集群下 hystrix 的 metrics 情况     
  * Hystrix - 熔断器，容错管理工具，旨在通过熔断机制控制服务和第三方库的节点,从而对延迟和故障提供更强大的容错能力
  * Zuul - Zuul 是在云平台上提供动态路由，监控，弹性，安全等边缘服务的框架。Zuul 相当于是设备和 Netflix 流应用的 Web 网站后端所有请求的前门
  * Spring Cloud Bus - 事件、消息总线，用于在集群（例如，配置变化事件）中传播状态变化，可与 Spring Cloud Config 联合实现热部署
  * Spring Cloud Sleuth - 日志收集工具包，封装了 Dapper 和 log-based 追踪以及 Zipkin 和 HTrace 操作，为 SpringCloud 应用实现了一种分布式追踪解决方案
  * Ribbon - 提供云端负载均衡，有多种负载均衡策略可供选择，可配合服务发现和断路器使用
        
# 配置详解
  * eureka
     * __eureka.client.register-with-eureka: false__    #表示是否将自己注册到Eureka Server，默认为true，由于当前应用就是Eureka Server，故为false
     * __eureka.client.fetch-registry: false__    #表示是否从Eureka Server获取注册信息，默认为true，因为是单点Eureka Server，不需要同步其它Eureka Server节点数据，故false
     * __eureka.client.service-url: 
            defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/__    #设置与Eureka Server交互的地址，查询服务和注册服务都需要依赖这个地址。默认是http://localhost:8761/eureka;多个地址使用，分隔，认证配置：http://user:password@${eureka.instance.hostname}:${server.port}/eureka/
     * __eureka.client.healthcheck.enabled: true__      #启用Eureka的健康检查
     * __eureka.instance.prefer-ip-address: true__      #表示将自己的IP注册到Eureka Server。 如不配置该属性或将其设置为false,则表示注册微服务所在操作系统的hostname到Eureka Server。           
     * __eureka.instance.ip-address: 127.0.0.1__        #在某些极端场景下，可以手动指定注册到Eureka Server的微服务IP。
     * __eureka.instance.metadata-map__    #表示为该微服务添加自定义的元数据，自定义的元数据key/value都可以随便写
     * __spring.profiles: peer1__     #peer1 为eureka.instance.hostname,启动时指定哪个profile启动，命令为--spring.profiles.active=peer1
     * __security.basic.enabled: true__      #开启基于HTTP basic的认证
     * __security.user.name: user__     #配置登录的账号是user
     * __security.user.password: password123__      #配置登录的密码是password123
     * __eureka.server.enable-self-preservation = false__        #禁用自我保护模式
     * __spring.cloud.inetutils.ignored-interfaces: - doctor0 -veth.*__      #表示忽略指定名称的网卡，如上表示忽略docker0网卡以及所有以veth开头的网卡。
     * __spring.cloud.inetutils.preferredNetworks: -192.168  -10.0__        #使用正则表达式，指定使用的网络地址
     * __spring.cloud.inetutils.useOnlySiteLocalInterfaces: true__        #强制使用站点本地地址。
  * Spring Cloud Config
     * __spring.cloud.config.server.git.uri__        #配置Git仓库的地址
     * __spring.cloud.config.server.git.search-paths__         #在当前git仓库路径下待搜索的文件夹
     * __spring.cloud.config.uri__         #config server地址     
     * __spring.cloud.config.fail-fast__         #在没有连接配置服务端时直接启动失败
     * __spring.cloud.config.retry.initial-interval__             #初始重试间隔（以毫秒为单位）
     * __spring.cloud.config.retry.multiplier__          #下一个间隔的乘数           
# 应用架构
  * registry - 服务注册与发现
  * config - 外部配置
  * monitor - 监控
  * zipkin - 分布式跟踪
  * gateway - 代理所有微服务的接口网关
  * auth-service - OAuth2 认证服务
  * user-micro-service 用户微服务
  
# 启动项目
  * 1、启动 registry  8761  eureka/eureka
  * 2、启动 config   8888
  * 3、启动 monitor  8040   admin/admin
  * 4、启动 zipkin   java -jar 
  * 5、启动 gateway  8080
  * 6、启动 auth－service   8081
  * 7、启动 user-micro-service 8082