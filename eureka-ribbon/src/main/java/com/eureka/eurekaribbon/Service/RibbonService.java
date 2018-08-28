package com.eureka.eurekaribbon.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static Logger logger = LoggerFactory.getLogger(RibbonService.class);

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//启用熔断机制
    public String hi(String name){
        logger.info("ribbon请求eureka-client 入参:{}",name);
        return restTemplate.getForObject("http://eureka-client/index/index?"+name,String.class);
    }

    public String hiError(String name){
        logger.info("eureka-client请求失败");
        return "服务器内部错误，请稍后再试";
    }
}
