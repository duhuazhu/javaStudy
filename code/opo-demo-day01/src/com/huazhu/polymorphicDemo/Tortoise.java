package com.huazhu.polymorphicDemo;

public class Tortoise extends Animal{

    @Override
    public void run() {
        System.out.println("�ڹ��ܵ�̫����");
    }

    @Override
    public void eat() {
        System.out.println("�ڹ�Եĺ���");
    }
}
