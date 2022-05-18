package com.huazhu.polymorphicDemo;

public class Tortoise extends Animal{

    @Override
    public void run() {
        System.out.println("ÎÚ¹êÅÜµÄÌ«ÂıÁË");
    }

    @Override
    public void eat() {
        System.out.println("ÎÚ¹ê³ÔµÄºÜÂı");
    }
}
