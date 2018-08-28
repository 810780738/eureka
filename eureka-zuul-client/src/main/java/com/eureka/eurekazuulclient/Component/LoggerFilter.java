package com.eureka.eurekazuulclient.Component;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2018/8/28 19:55
 * @Description:链路追踪过滤器
 */
@Component
public class LoggerFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(LoggerFilter.class);

    @Autowired
    Tracer tracer;

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return Boolean.TRUE;
    }

    @Override
    public Object run() {
        tracer.addTag("operator","小猪");
        logger.info(tracer.getCurrentSpan().traceIdString());
        return null;
    }
}
