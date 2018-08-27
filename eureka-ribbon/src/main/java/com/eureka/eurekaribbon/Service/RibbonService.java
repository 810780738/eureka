package com.eureka.eurekaribbon.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Administrator
 * @Date: 2018/8/25 22:08
 * @Description:
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//启用熔断机制
    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/index/index?"+name,String.class);
    }

    public String hiError(String name){
        return "服务器内部错误，请稍后再试";
    }
}
