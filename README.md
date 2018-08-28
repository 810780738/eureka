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
