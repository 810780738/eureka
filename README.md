1.0 首先启动eureka-server
然后多端口启动eureka-client
然后启动eureka-ribbon
在浏览器中输入：http://localhost:8764/hi?name=forzep
看到端口在变化，表示负载成功

1.1 整合了feign做负载，可自行选择或者同时使用

1.2 feign、ribbon添加hystrix熔断机制

1.3 添加单个模块熔断监听器和聚合熔断监听器
