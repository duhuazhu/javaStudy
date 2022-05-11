package com.huazhu.whileDemo;

/*
 * ?????while ???????????? ??while
 * */
public class whileDemo {
    public static void main(String[] args) {
        double packHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while (paperThickness < packHeight) {
            paperThickness *= 2;
            count++;
        }
        System.out.println(count);
        System.out.println(paperThickness);
    }
}
