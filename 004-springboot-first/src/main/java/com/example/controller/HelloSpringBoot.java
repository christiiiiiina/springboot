package com.example.controller;

import com.example.vo.SchoolInfoVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author wangmufan
 * @date 2021/11/22
 * @apiNote
 */
@Controller
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
    @ResponseBody
    public String helloSpringBoot(){
        return "欢迎使用SpringBoot框架";
    }

    @RequestMapping("/info")
    @ResponseBody
    public String queryInfo(){
        return "SchoolInfoVO对象==" + schoolInfoVO.toString();
    }
}
