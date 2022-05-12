package com.huahzhu.arrStatic;

public class funArr {
    private funArr() {

    }

    public static String toString(int[] arr) {
        {
            System.out.println("构造器执行力 我就执行");
        }
        if (arr == null) {
            return null;
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        result += "]";
        return result;
    }
}
