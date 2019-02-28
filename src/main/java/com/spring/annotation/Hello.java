package com.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2019/2/28.
 * 采用注解开发的bean
 * @Component用于类别级的注解，标注本类一个可被spring容器托管的bean
 */
@Component
public class Hello {
    public String getHello(){
        return "hello world";
    }
}
