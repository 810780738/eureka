package com.eureka.configclient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhusm
 * @Date: 2018/8/28 14:56
 * @Description:验证地址指向的是Config-server中配置的地址 http://localhost:8762/foo
 */
@RestController
@RefreshScope
public class ConfigApiController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/foo")
    public String hi(){
        return foo;
    }
}
