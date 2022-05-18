package com.huazhu.polymorphicTest;

public class keyboard implements USB2{
    private String name;

    public keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void insertion() {
        System.out.println(getName() + "键盘已经连接成功");
    }

    @Override
    public void disconnect() {
        System.out.println(getName() + "键盘已经断开连接");
    }
    public void keyDown(){
        System.out.println(getName() + "键盘按下去");
    }
}
