package com.huazhu.polymorphicDemo;

public  class dog extends Animal {
    private String name;

    public String getName() {
        return name;
    }

    public dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(getName() + "�ܹ�����");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "Ҫ�Զ���");

    }
}
