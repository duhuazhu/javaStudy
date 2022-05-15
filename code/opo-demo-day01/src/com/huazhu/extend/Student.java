package com.huazhu.extend;

public class Student extends people {
    /**
     * 子类继承父类
     * 调用需要new
     */
    public void WriteName(){
        System.out.println("我的名字是" + this.getName() + ",我今年" + this.getAge() + "我是" + this.getSex() + "的");
    }

}
