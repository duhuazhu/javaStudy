package com.huazhu.polymorphicTest;

public class test {
    public static void main(String[] args) {
        computer computer = new computer("����");
        computer.start();
        USB2 mouse=  new mouse("׿��");
        USB2 keyboard=  new mouse("������");
        mouse.insertion();
        keyboard.insertion();
        computer.installUSB2(mouse);
        computer.installUSB2(keyboard);
    }
}
