package com.huazhuArray;

import java.util.Arrays;
import java.util.Comparator;

public class huazhuArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 5465, 12, 156, 23, 431, 23, 60};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 1212);
        System.out.println(index);
        Integer[] arr1 = {10, 5, 5465, 12, 156, 23, 431, 23, 60};


     /*   Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

        Arrays.sort(arr1, ( o1,  o2)->  o2 - o1);
        System.out.println(Arrays.toString(arr1));
    }
}
