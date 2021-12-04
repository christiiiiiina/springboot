package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangmufan
 * @date 2021/12/5
 * @apiNote
 */
@RestController
public class StudentController {

    @Resource
    private StudentService service;

    @RequestMapping("/addStudent")
    public String addStudent(String name, Integer age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        int rows = service.addStudent(student);

        return "添加学生：" + rows;
    }
}
