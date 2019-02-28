package com.spring.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2019/2/28.
 */
@Component
@Data
public class Student {
    @Value("小张")
    private String name;
    @Value("25")
    private int age;
    //使用@autowired注入一个
    @Autowired
    private Phone phone;

}
