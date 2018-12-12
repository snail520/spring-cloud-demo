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
     
                
# 应用架构
  * registry - 服务注册与发现