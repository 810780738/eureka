package com.eureka.eurekafeign.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Administrator
 * @Date: 2018/8/27 11:05
 * @Description:
 */
@Service
public class HiSerice {
    private static Logger logger = LoggerFactory.getLogger(HiSerice.class);

    @Autowired
    EurekaFeignClient eurekaFeignClient;

    public String sayHi(String name){
        logger.info("feign请求eureka-client 入参:{}",name);
        return eurekaFeignClient.sayHiFromClientEureka(name);
    }
}
