package com.example.service.impl;

import com.example.dao.StudentMapper;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author wangmufan
 * @date 2021/12/5
 * @apiNote
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentDao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addStudent(Student student) {
        System.out.println("业务方法addStudent");
        int rows = studentDao.insert(student);
        System.out.println("执行sql语句");

//        抛出一个运行时异常，目的是回滚事务
//        int m = 10 / 0;

        return rows;
    }
}
