package com.spring.annotation;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2019/2/28.
 */
@Component
@Data
public class Phone {
    @Value("iphone")
    private String brand;
    @Value("5642")
    private int price;
}
