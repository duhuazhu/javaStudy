package com.huazhu.polymorphicDemo;

public class test {
    public static void main(String[] args) {
        //Animal dog可以体现多态
        Animal dog = new dog("小狗彤彤");
        dog.run();
        dog.eat();
    }
}
