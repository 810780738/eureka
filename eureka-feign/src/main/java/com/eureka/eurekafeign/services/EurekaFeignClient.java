package com.eureka.eurekafeign.services;

import com.eureka.eurekafeign.FeignConfig;
import com.eureka.eurekafeign.hystrix.HiHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: Administrator
 * @Date: 2018/8/27 10:56
 * @Description:调用eureka-client的地址
 */
@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaFeignClient {

    @GetMapping("/index/index") //eureka-client的请求地址
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
