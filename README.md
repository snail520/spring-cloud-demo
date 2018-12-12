# spring-cloud-demo

# 技术栈
  * eureka - 服务发现组件
       * 1、提供服务发现的能力，各个微服务启动时，会向Eureka Server注册自己的信息(例如IP、端口、微服务名称等)，Eureka Server会存储这些信息
       * 2、微服务启动后，会周期性(默认30秒)向Eureka Server发送心跳，以续约自己"租期"。
       * 3、如果Eureka Server在一定时间内没有接收到某个服务实例心跳，将会注销该实例(默认90秒)
       * 4、多个Eureka Server实例通过复制方式，来实现服务注册表中的数据同步
       * 5、Eureka Client会缓存服务注册表中的信息
        
# 配置详解
  * eureka
     __eureka.client.register-with-eureka: false__ #表示是否将自己注册到Eureka Server，默认为true，由于当前应用就是Eureka Server，故为false
     __eureka.client.fetch-registry: false__ #表示是否从Eureka Server获取注册信息，默认为true，因为是单点Eureka Server，不需要同步其它Eureka Server节点数据，故false
     * eureka.client.service-url: defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
         #设置与Eureka Server交互的地址，查询服务和注册服务都需要依赖这个地址。默认是http://localhost:8761/eureka;多个地址使用，分隔
                
# 应用架构
  * registry - 服务注册与发现