1.0 首先启动eureka-server
然后多端口启动eureka-client
然后启动eureka-ribbon
在浏览器中输入：http://localhost:8764/hi?name=forzep
看到端口在变化，表示负载成功

1.1 整合了feign做负载，可自行选择或者同时使用

1.2 feign、ribbon添加hystrix熔断机制

1.3 添加单个模块熔断监听器和聚合熔断监听器

1.4 添加Zuul智能路由网关 依次启动Eureka-Server，多端口启动Eureka-client，Eureka-Ribbon，Eureka-feign，Eureka-zuul-Client
    在浏览器中输入 http://localhost:5000/ribbonapi/hi  输出多个端口则表示成功

1.5 集成spring cloud config 配置文件系统 （读取本地配置文件） 先启动config-server 再启动config-client。config-client控制台会看到config-server配置的端口8762 ，浏览器输入 localhost:8762/foo  验证config-client读取的是config-server中的配置文件

1.5.1 不重启刷新配置文件使之生效
       1.启动eureka-server，config-server，config-client 访问localhost:8772 得到version 1
       2.修改远程配置文件 version 2 
       3.发送一个post请求 localhost:8772/bus/refresh
       4.再次访问 localhost:8772 得到version 2 验证成功
       
1.6 添加springCloud sleuth链路追踪
       链路追踪有多钟方式：springcloud本身的支持外还以用RabbitMQ消息组件，mysql存储，ElasticSea存储，Kibanna展示链路数据等
       本项目只有springcloud本身和RabbitMQ做链路数据传输，其它的自行百度
