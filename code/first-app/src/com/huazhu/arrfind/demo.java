package com.huazhu.arrfind;

//��д���� ��ѯ����Ԫ�� ���� ����  �����ڷ���-1
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
