package com.example.config;

import com.example.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangmufan
 * @date 2021/12/4
 * @apiNote
 */
@Configuration
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login", "/test");

        return bean;
    }
}
