package com.example.controller;

import com.example.model.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangmufan
 * @date 2021/12/5
 * @apiNote
 */
@RestController
public class MyRedisController {

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 添加String类型的数据到redis
     * @return 结果
     */
    @PostMapping("/redis/addstring")
    public String add2redis(){
//        操作redis中的String类型数据，先获取ValueOperations对象
        ValueOperations valueOperations = redisTemplate.opsForValue();
//        添加数据到redis
        valueOperations.set("myname", "lisi");

        return "向redis添加String类型的数据";
    }

    @GetMapping("/redis/getk")
    public String getData(String k){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object v = valueOperations.get(k);

        return "key是" + k + ",value是" + v;
    }

    /**
     * 设置RedisTemplate序列化
     * @param k key
     * @param v value
     * @return 结果
     */
    @PostMapping("/redis/addstr")
    public String addString(String k, String v){
//        使用RedisTemplate
//        设置key使用的String的序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        设置key使用的String的序列化
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set(k, v);

        return "定义RedisTemplate对象的key和value的序列化";
    }

    @PostMapping("/redis/addjson")
    public String addJson(){
        Student student = new Student();
        student.setId(1001);
        student.setName("zhangsan");
        student.setAge(20);

        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        把value作为json序列化
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        redisTemplate.opsForValue().set("mystudent", student);

        return "json的序列化";
    }

    @PostMapping("/redis/getjson")
    public String getJson(){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        把value作为json序列化
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        Object obj = redisTemplate.opsForValue().get("mystudent");

        return "json的反序列化" + obj;
    }
}
