package com.huazhu.singleinstance;
/**
 * ÀÁººµ¥Àý
 */
public class Test2 {
    public static void main(String[] args) {
        SingleInstance2 s1 = SingleInstance2.getInstance();
        SingleInstance2 s2 =  SingleInstance2.getInstance();
        System.out.println(s1 == s2);
    }
}
