package com.huazhuAPI;

public class test1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("Êä³ö" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0  + "s");
    }
}
