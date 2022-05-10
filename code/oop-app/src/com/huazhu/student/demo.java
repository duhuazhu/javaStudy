package com.huazhu.student;

import java.util.ArrayList;
import java.util.Scanner;

/*
 students.add(new student(20180302,"叶顾城",23,"护理一班"));
 students.add(new student(20180301,"独孤求败",20,"护理二班"));
 students.add(new student(20180311,"邱若彤",23,"服装一班"));
*/


public class demo {
    public static void main(String[] args) {
       ArrayList<student>students = new ArrayList<>();
       students.add(new student(20180302,"叶顾城",23,"护理一班"));
       students.add(new student(20180301,"独孤求败",20,"护理二班"));
       students.add(new student(20180311,"邱若彤",23,"服装一班"));
        System.out.println("学号\t\t\t名称\t\t年纪\t\t班级");
        for (student s : students) {
            System.out.println(s.getCode() + "\t" + s.getName() + "\t" + +s.getAge() + "\t" + s.getUnit());
        }
            Scanner sc =new Scanner(System.in);

        while (true){
            System.out.println("请输入你要查找的学生的学号:");
            int code  = sc.nextInt();
            student s =  SearchStudentsById(students,code);
            if(s==null){
                System.out.println("不好意思查无此人");
            }else{
                System.out.println(s.getCode() +"\t"+ s.getName()+"\t"+  + s.getAge() +"\t"+  s.getUnit());
                break;
            }
        }
    }

    public static student SearchStudentsById(ArrayList<student>students,int code){
        for (int i = 0; i < students.size(); i++) {
            student s =  students.get(i);
            if(s.getCode()==code){
                return s;
            }
        }
        return null;
    };
   
}
