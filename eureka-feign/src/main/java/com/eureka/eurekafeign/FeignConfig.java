package com.eureka.eurekafeign;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @Auther: Administrator
 * @Date: 2018/8/27 10:59
 * @Description:feign配置类
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){
        //请求重试间隔100毫秒 ，最大重试时间1s，重试5次
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
}
