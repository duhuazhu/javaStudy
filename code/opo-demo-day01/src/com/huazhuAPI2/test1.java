package com.huazhuAPI2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {
    public static void main(String[] args) throws ParseException {
        String dataTime = "2020年10月10日 10:10:10";
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = s.parse(dataTime);
        Long time  =d.getTime()+ (10L*3600*1000*24);
        System.out.println(s.format(time));

    }
}
