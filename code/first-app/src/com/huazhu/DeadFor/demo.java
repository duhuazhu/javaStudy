package com.huazhu.DeadFor;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int okPassWorld = 520;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("�������������");
            int passWorld = sc.nextInt();
            if (passWorld == 520) {
                System.out.println("�������������ȷ");
                break;
            } else {
                System.out.println("����������벻��ȷ");
            }
        }
    }
}
