package com.huazhuAPI2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        Date d =   new Date();
        System.out.println(d);
//        System.out.println(d.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’ HH:mm:ss EEE a");
        System.out.println(simpleDateFormat.format(d));

        long l = System.currentTimeMillis() + 121 * 1000;
        System.out.println(simpleDateFormat.format(l));
    }
}
