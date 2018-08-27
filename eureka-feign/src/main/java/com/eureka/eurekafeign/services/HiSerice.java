package com.eureka.eurekafeign.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Administrator
 * @Date: 2018/8/27 11:05
 * @Description:
 */
@Service
public class HiSerice {

    @Autowired
    EurekaFeignClient eurekaFeignClient;

    public String sayHi(String name){
        return eurekaFeignClient.sayHiFromClientEureka(name);
    }
}
