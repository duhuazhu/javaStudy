package com.huazhu.student;

public class student {
    private int code;
    private String name;

    public student() {
    }

    public student(int code, String name, int age, String unit) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.unit = unit;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    private int age;
    private String unit;

}
