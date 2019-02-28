package com.soft1721.spring.hello;

/**
 * Created by lenovo on 2019/2/25.
 */
public class phone {
    public static void main(String[] args) {

    }
    @Override
    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    private String brand;
    private int price;
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public phone(String brand,int price) {
        this.brand = brand;
        this.price=price;
    }



}
