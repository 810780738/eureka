package com.eureka.eurekazuulclient.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @Auther: Administrator
 * @Date: 2018/8/28 11:48
 * @Description:过滤器
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);


    @Override
    public String filterType() {
        //请求到达前验证
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //值越小  优先级越高
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        Object name = request.getParameter("name");
        if (name == null){
            log.warn("name is empty");
            //将错误信息输出到浏览器
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            try {
                context.getResponse().getWriter().write("name is empty");
            } catch (IOException e) {
                return null;
            }
        }
        log.info("OK");
        return null;
    }
}
