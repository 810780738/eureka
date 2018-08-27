package com.eureka.eurekamonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class EurekaMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMonitorApplication.class, args);
	}
}
