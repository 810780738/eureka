package com.eureka.eurekaribbon.Service;

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

    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/index/index?"+name,String.class);
    }
}
