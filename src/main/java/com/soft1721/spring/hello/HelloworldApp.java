package com.soft1721.spring.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;

/**
 * Created by lenovo on 2019/2/25.
 */
public class HelloworldApp {
    public static void main(String[] args) {
        //读入配置文件
        ApplicationContext context=new
                ClassPathXmlApplicationContext("/beans.xml");
        //读取配置好的xml
        Helloworld helloworld=(Helloworld)context.getBean("helloworld");
        //运行hello world的方法
        System.out.print(helloworld.getHello());



    }
}
