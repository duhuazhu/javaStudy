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
        System.out.println(name + "�����ܲ�ѵ��");
    }

    @Override
    public void competition() {
        System.out.println(name + "Ҫ�μ��ܲ�Ϊ������");
    }
}
