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
        System.out.println(getName() + "�����Ѿ����ӳɹ�");
    }

    @Override
    public void disconnect() {
        System.out.println(getName() + "�����Ѿ��Ͽ�����");
    }
    public void keyDown(){
        System.out.println(getName() + "���̰���ȥ");
    }
}