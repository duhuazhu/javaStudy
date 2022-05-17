package com.huazhu.templete;

public abstract class student {
    public static final String age = "20";
    public  final void write(){
        System.out.println("ÄãºÃ");
        System.out.println(writeMain());
        System.out.println("ÔÙ¼û");
    }
    public abstract  String writeMain();
}
