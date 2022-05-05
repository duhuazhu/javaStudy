package com.huazhu.DeadFor;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int okPassWorld = 520;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的密码");
            int passWorld = sc.nextInt();
            if (passWorld == 520) {
                System.out.println("你输入的密码正确");
                break;
            } else {
                System.out.println("你输入的密码不正确");
            }
        }
    }
}
