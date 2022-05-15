package com.huazhu.extend;

public class people {
    /**
     * 父类的方法
     */
    private String name;

    public people() {
    }

    public String getName() {
        return name;
    }

    public people(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String sex;
    private int age;
}
