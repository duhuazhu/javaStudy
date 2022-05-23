package com.huazhuAPI;

import java.util.Objects;

public class test {
    public static void main(String[] args) {
        Student student = new Student("duhuazhu","ÄÐ",24);
        Student student1 = new Student("duhuazhu","ÄÐ",24);

//        System.out.println(student);
//        System.out.println(student.equals(student1));


        String a =  null;
        String a1 = "ko";
//        System.out.println(a.equals(a1));
        System.out.println(Objects.equals(a, a1));


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("123").append("456");
//        System.out.println(stringBuilder);
        System.out.println(System.currentTimeMillis());
        System.out.println(stringBuilder.toString());
    }
}
