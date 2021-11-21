package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangmufan
 * @date 2021/11/22
 * @apiNote
 */
@Controller
public class HelloSpringBoot {

    @RequestMapping("/hello/springboot")
    @ResponseBody
    public String helloSpringBoot(){
        return "欢迎使用SpringBoot框架";
    }
}
