package com.huazhuAPI2;

import java.util.Calendar;
import java.util.Date;

public class test4 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH)+1);
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));
        instance.add(Calendar.DAY_OF_YEAR,60);
        Date time = instance.getTime();
        System.out.println(time);
    }
}
