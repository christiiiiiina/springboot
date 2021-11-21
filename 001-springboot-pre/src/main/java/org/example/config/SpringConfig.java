package org.example.config;

import org.example.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @author wangmufan
 * @date 2021/11/20
 * @apiNote
 */
@Configuration
@ImportResource(value = "classpath:applicationContext.xml")
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "org.example.vo")
public class SpringConfig {

    /**
     * 创建方法，方法的返回值是对象
     * 在方法上加入@Bean，方法的返回值就注入到容器中
     *
     * @Bean：把对象注入到spring容器中，作用相当于<Bean>
     *
     */
    @Bean
    public Student createStudent(){
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(26);
        s1.setSex("男");

        return s1;
    }

    /**
     * 指定对象在容器中的名称（制定<bean>的id属性）
     * @return
     */
    @Bean(name = "lisiStudent")
    public Student makeStudent(){
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(22);
        s2.setSex("男");

        return s2;
    }
}
