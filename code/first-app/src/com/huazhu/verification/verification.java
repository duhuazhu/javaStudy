package com.huazhu.verification;

import java.util.Random;

public class verification {
    public static void main(String[] args) {
        System.out.println(verificat(5));
    }

    public static String verificat(int n) {
        String ver="";
        Random r =new Random();
        for (int i = 0; i < n; i++) {
            int type =r.nextInt(3);
            switch (type){
                case 0:
                    char ch =(char)(r.nextInt(26) + 65);
                    ver+=ch;
                    break;
                case 1:
                    char ch1 =(char)(r.nextInt(26) + 97);
                    ver+=ch1;
                    break;
                case 2:
                    int ch2  =r.nextInt(10);
                    ver+=ch2;
                    break;
            }
        }
        return ver;
    }
}
