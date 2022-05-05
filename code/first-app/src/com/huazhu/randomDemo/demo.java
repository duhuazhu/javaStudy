package com.huazhu.randomDemo;

import java.util.Random;

public class demo {
    public static void main(String[] args) {
        Random random = new Random();
       /* for (int i = 0; i < 20; i++) {
            int number = random.nextInt(10) + 1;
            System.out.println(number);
        }*/
        for (int i = 0; i < 20; i++) {
            // 3- 17
            int number = random.nextInt(15);
            System.out.println(number);
        }
    }
}
