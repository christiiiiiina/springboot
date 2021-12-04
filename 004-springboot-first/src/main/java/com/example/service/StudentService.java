package com.example.service;

import com.example.model.Student;

/**
 * @author wangmufan
 * @date 2021/12/5
 * @apiNote
 */
public interface StudentService {

    /**
     * 添加Student对象
     * @param student Student对象
     * @return 执行成功
     */
    int addStudent(Student student);
}
