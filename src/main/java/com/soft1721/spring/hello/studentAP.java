package com.soft1721.spring.hello;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2019/2/25.
 */
public class studentAP {
    public static void main(String[] args) {
        ApplicationContext context=new
                ClassPathXmlApplicationContext("/beans.xml");
        Student student=(Student)context.getBean("Student");
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getPhone());

    }
}
