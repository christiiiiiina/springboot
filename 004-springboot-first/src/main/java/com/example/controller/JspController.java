package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangmufan
 * @date 2021/11/23
 * @apiNote
 */
@Controller
public class JspController {

    @RequestMapping("/myjsp")
    public String doJsp(Model model){
        model.addAttribute("data", "SpringBoot使用jsp");

        return "index";
    }
}
