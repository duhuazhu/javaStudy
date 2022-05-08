package com.huazhu.creatobject;
//只有一个public的类 可以多个class类
public class Car {
    String name;
    Double price;
    public void start(){
        System.out.println(name + "启动了");
    }
    public void run(){
        System.out.println(name + "的售价是"+price);
    }
}
