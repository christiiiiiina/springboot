package com.example.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangmufan
 * @date 2021/12/4
 * @apiNote 自定义拦截器
 */
public class MyLoginInterceptor implements HandlerInterceptor {


    /**
     * true请求能被Controller处理，false请求被拦截
     * @param request
     * @param response
     * @param handler 被拦截的控制器对象
     * @return true请求能被Controller处理，false请求被拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行了MyInterceptor拦截器的preHandle方法");
        return true;
    }
}
