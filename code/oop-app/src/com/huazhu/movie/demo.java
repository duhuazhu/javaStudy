package com.huazhu.movie;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        movie[] movies = new movie[3];
        movies[0] = new movie("���������", 9.7, "�⾩");
        movies[1] = new movie("�������1��", 9.7, "�⾩");
        movies[2] = new movie("�������2��", 9.7, "�⾩");


        for (int i = 0; i < movies.length; i++) {
            System.out.println("Ƭ��:"+movies[i].getName());
            System.out.println("����:"+movies[i].getGrade());
            System.out.println("����:"+movies[i].getDirector());
            System.out.println("------------------------------------------");
        }

        char a = 111;
        System.out.println(a);
    }
}

