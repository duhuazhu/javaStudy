package com.huazhu.polymorphicDemo;

public class test {
    public static void main(String[] args) {
        //Animal dog可以体现多态  自动类型转换
        Animal d1 = new dog("小狗彤彤");
        d1.run();
        d1.eat();
        Animal d2 = new Tortoise();
        if(d1 instanceof  dog){
            // 强制类型转换
            Tortoise t = (Tortoise) d2;
        }else{
            dog dog = new dog("小狗彤彤");
            dog.lookDoor();
        }


    }
}
