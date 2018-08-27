package com.eureka.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard  //启用熔断器监听器
public class EurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignApplication.class, args);
	}
}
