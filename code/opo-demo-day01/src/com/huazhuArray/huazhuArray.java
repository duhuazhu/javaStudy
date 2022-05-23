package com.huazhuArray;

import java.util.Arrays;

public class huazhuArray {
    public static void main(String[] args) {
        int[] arr = {10,5,5465,12,156,23,431,23,60};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,1212);
        System.out.println(index);
    }
}
