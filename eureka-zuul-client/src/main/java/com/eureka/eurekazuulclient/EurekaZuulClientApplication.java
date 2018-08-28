package com.eureka.eurekazuulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient  //Eureka客户端
@EnableZuulProxy  //开启Zuul智能网关
public class EurekaZuulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulClientApplication.class, args);
	}
}
