package com.huazhu.sranner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("请输入你的年纪");
        int age  = sc.nextInt();
        System.out.println("你的年纪是" + age);

        System.out.println("请输入你的名称");
        String name  = sc.next();
        System.out.println("欢迎" + name);
    }
}
