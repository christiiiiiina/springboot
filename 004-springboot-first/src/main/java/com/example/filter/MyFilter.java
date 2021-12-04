package com.example.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author wangmufan
 * @date 2021/12/4
 * @apiNote
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了MyFilter的doFilter方法");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
