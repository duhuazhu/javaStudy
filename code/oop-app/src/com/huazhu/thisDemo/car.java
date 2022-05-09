package com.huazhu.thisDemo;

public class car {
    private String name;
    private double price;


    public double getCarPrice() {
        return this.price;
    }

    public void setCarPrice(double price) {
        if (0 < price && price < 200) {
            this.price =price;
        }else{
            System.out.println("你的价格太高了");
        }
    }
}
