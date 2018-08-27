package com.eureka.eurekafeign.Controller;

import com.eureka.eurekafeign.services.HiSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/8/27 11:08
 * @Description:
 */
@RestController
public class HiController {


    @Autowired
    HiSerice hiSerice;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "forezp",required = false) String name){
        return hiSerice.sayHi(name);
    }
}
