package com.huazhu.arrdemo;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        double[] scores = {10.121, 99.3, 10.2, 1.3};
        for(double score : scores){
            System.out.println(score);
        }
        String[] names ={"1","张三","李四"};
        System.out.println(Arrays.toString(names));
    }
}
