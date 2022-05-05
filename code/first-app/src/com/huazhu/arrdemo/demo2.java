package com.huazhu.arrdemo;

import java.util.Random;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numberArr = new int[5];
        for (int i = 0; i < numberArr.length; i++) {
            int number = random.nextInt(20) + 1;
            numberArr[i] = number;
        }
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.println("请输入一个1-20之间的整数进行猜测");
            int inputNumber = sc.nextInt();
            for (int i = 0; i < numberArr.length; i++) {
                if (inputNumber == numberArr[i]) {
                    System.out.println("恭喜你 输入正确了,索引是"+i);
                    break OUT;
                }
            }
            System.out.println("没有猜对,请继续输入");

        }
        for (int i = 0; i < numberArr.length; i++) {
            System.out.println(numberArr[i]);
        }

    }
}
