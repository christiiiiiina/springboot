package com.example.config;

import com.example.interceptor.MyLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wangmufan
 * @date 2021/12/4
 * @apiNote
 */
@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {

    /**
     * 添加拦截器对象，注入到容器中
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor interceptor = new MyLoginInterceptor();

//        制定拦截的请求url地址
        String[] path = {"/user/**"};
//        指定不拦截的请求url地址
        String[] excludePath = {"/user/login"};
        registry.addInterceptor(interceptor)
                .addPathPatterns(path)
                .excludePathPatterns(excludePath);
    }
}
