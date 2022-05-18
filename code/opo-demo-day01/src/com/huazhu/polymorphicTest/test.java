package com.huazhu.polymorphicTest;

public class test {
    public static void main(String[] args) {
        computer computer = new computer("´÷¶û");
        computer.start();
        USB2 mouse=  new mouse("×¿Íþ");
        USB2 keyboard=  new mouse("º£µÁ´¬");
        mouse.insertion();
        keyboard.insertion();
        computer.installUSB2(mouse);
        computer.installUSB2(keyboard);
    }
}
