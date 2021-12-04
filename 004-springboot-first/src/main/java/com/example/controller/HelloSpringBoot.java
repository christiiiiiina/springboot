package com.example.controller;

import com.example.vo.SchoolInfoVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangmufan
 * @date 2021/11/22
 * @apiNote
 */
@RestController
public class HelloSpringBoot {

    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String name;

    @Resource
    private SchoolInfoVO schoolInfoVO;

    @RequestMapping("/hello/springboot")
    public String helloSpringBoot(){
        return "欢迎使用SpringBoot框架";
    }

    @RequestMapping("/info")
    public String queryInfo(){
        return "SchoolInfoVO对象==" + schoolInfoVO.toString();
    }
}
