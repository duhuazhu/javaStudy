package com.huazhu.javabean;

public class user {
    private String name;
    private double height;
    private double salary;

    public user() {
    }

    public user(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
