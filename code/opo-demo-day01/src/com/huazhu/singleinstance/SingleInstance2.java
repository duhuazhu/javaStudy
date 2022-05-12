package com.huazhu.singleinstance;

public class SingleInstance2 {
    private static SingleInstance2 instance;
    public static SingleInstance2 getInstance(){
        if (instance==null){
            instance = new SingleInstance2();
        }
        return instance;
    }
}
