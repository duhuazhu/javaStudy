package com.huazhu.polymorphicDemo;

public class test {
    public static void main(String[] args) {
        //Animal dog�������ֶ�̬  �Զ�����ת��
        Animal d1 = new dog("С��ͮͮ");
        d1.run();
        d1.eat();
        Animal d2 = new Tortoise();
        if(d1 instanceof  dog){
            // ǿ������ת��
            Tortoise t = (Tortoise) d2;
        }else{
            dog dog = new dog("С��ͮͮ");
            dog.lookDoor();
        }


    }
}
