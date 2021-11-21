package org.example.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wangmufan
 * @date 2021/11/20
 * @apiNote
 */
@Component("tiger")
public class Tiger {

    @Value("${tiger.name}")
    private String name;
    @Value("${tiger.age}")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
