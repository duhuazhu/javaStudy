package com.huahzhu.arrStatic;

public class demo {
    static {
        System.out.println("静态代码块,自动触发一次");
    }

    public static void main(String[] args) {
        int []arr1={1,23,4,5,6,12};
        System.out.println(funArr.toString(arr1));
    }
}
