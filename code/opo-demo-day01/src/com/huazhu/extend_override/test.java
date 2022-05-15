package com.huazhu.extend_override;

public class test {
    public static void main(String[] args) {
        student student = new student();
        student.run();
    }


}
class people{
    public void run(){
        System.out.println("小猪快跑");
    }
}

class student extends people{
    @Override
    public void run(){
        super.run();
        System.out.println("小猪,小狗快跑");
    }
}