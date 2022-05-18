package com.huazhu.innerClass_anonymous;

public class test {
    public static void main(String[] args) {
        runFast(new Animal() {
            @Override
            public void run() {
                System.out.println("跑的飞快");
            }
        });
    }
    public static void runFast(Animal animal){
        System.out.println("开始");
        animal.run();
    }
}


abstract class  Animal{
    public abstract void run();
}