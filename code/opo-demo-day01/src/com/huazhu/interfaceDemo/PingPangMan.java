package com.huazhu.interfaceDemo;

public class PingPangMan implements sportMan{
    private String name;

    public PingPangMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "必须跑步训练");
    }

    @Override
    public void competition() {
        System.out.println(name + "要参加跑步为国争光");
    }
}
