package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangmufan
 * @date 2021/11/22
 * @apiNote
 */
@RestController
public class BootController {

    @RequestMapping("/hello")
    public String doSome(){
        return "hello SpringBoot应用，设置了端口";
    }

    @GetMapping("/user/account")
    public String userAccount(){
        return "访问user/account地址";
    }

    @GetMapping("/user/login")
    public String userLogin(){
        return "访问user/login地址";
    }
}
