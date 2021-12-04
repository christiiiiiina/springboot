package com.example.config;

import com.example.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

/**
 * @author wangmufan
 * @date 2021/12/4
 * @apiNote
 */
@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new MyFilter());
        bean.addUrlPatterns("/user/*");

        return bean;
    }
}
