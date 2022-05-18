package com.huazhu.polymorphicTest;

public class mouse implements USB2{
    private String name;

    public mouse(String name) {
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
        System.out.println(getName() + "鼠标已经连接成功");
    }

    @Override
    public void disconnect() {
        System.out.println(getName() + "鼠标已经断开连接");
    }
    public void click(){
        System.out.println(getName() + "鼠标点击");
    }
}
