package com.huazhu.innerClass_anonymous;

public class test {
    public static void main(String[] args) {
        runFast(new Animal() {
            @Override
            public void run() {
                System.out.println("�ܵķɿ�");
            }
        });
    }
    public static void runFast(Animal animal){
        System.out.println("��ʼ");
        animal.run();
    }
}


abstract class  Animal{
    public abstract void run();
}