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
public class BootController {

    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){
        return "hello SpringBoot应用，设置了端口";
    }
}
