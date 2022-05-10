package com.huazhu.student;

import java.util.ArrayList;
import java.util.Scanner;

/*
 students.add(new student(20180302,"Ҷ�˳�",23,"����һ��"));
 students.add(new student(20180301,"�������",20,"�������"));
 students.add(new student(20180311,"����ͮ",23,"��װһ��"));
*/


public class demo {
    public static void main(String[] args) {
       ArrayList<student>students = new ArrayList<>();
       students.add(new student(20180302,"Ҷ�˳�",23,"����һ��"));
       students.add(new student(20180301,"�������",20,"�������"));
       students.add(new student(20180311,"����ͮ",23,"��װһ��"));
        System.out.println("ѧ��\t\t\t����\t\t���\t\t�༶");
        for (student s : students) {
            System.out.println(s.getCode() + "\t" + s.getName() + "\t" + +s.getAge() + "\t" + s.getUnit());
        }
            Scanner sc =new Scanner(System.in);

        while (true){
            System.out.println("��������Ҫ���ҵ�ѧ����ѧ��:");
            int code  = sc.nextInt();
            student s =  SearchStudentsById(students,code);
            if(s==null){
                System.out.println("������˼���޴���");
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
