package com.example.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author wangmufan
 * @date 2021/12/5
 * @apiNote
 */
@RestController
public class MyRestController {

    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable("stuId") Integer studentId){
        return "查询学生studentId=" + studentId;
    }

    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name") String name,
                                @PathVariable("age") Integer age){
        return "创建资源，执行post请求方式：name=" + name + "#age=" + age;
    }

    @PutMapping("/student/{id}/{age}")
    public String modifyStudent(@PathVariable("id") Integer id,
                                @PathVariable("age") Integer age){
        return "更新资源，执行put请求方式：id=" + id + "#age=" + age;
    }

    @DeleteMapping("/student/{id}")
    public String modifyStudent(@PathVariable("id") Integer id){
        return "删除资源，执行delete请求方式：id=" + id;
    }
}
