package com.eureka.eurekafeign.hystrix;

import com.eureka.eurekafeign.services.EurekaFeignClient;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2018/8/27 17:19
 * @Description:
 */
@Component
public class HiHystrix implements EurekaFeignClient {
    @Override
    public String sayHiFromClientEureka(String name) {
        System.out.println("Feign 负载熔断....");
        return "服务器内部错误，请稍后再试";
    }
}
