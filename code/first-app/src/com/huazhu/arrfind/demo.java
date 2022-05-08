package com.huazhu.arrfind;

//编写数组 查询数组元素 存在 返回  不存在返回-1
public class demo {
    public static void main(String[] args) {
        int [] arr1={1,2,34};
        int index =  findArr(arr1,1121);
        System.out.println(index);
    }

    public static int findArr(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return data;
            }
        }
        return -1;
    }
}
