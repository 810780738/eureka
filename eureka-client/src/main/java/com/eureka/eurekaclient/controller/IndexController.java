package com.eureka.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/8/25 19:56
 * @Description:
 */
@RestController
@RequestMapping("index")
public class IndexController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("index")
    public String index(){

        return "index"+port;
    }
}
