package com.huazhuAPI2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test3 {
    public static void main(String[] args) throws ParseException {
        String startTime = "2021-11-11 00:00:00";
        String endTime =   "2021-11-11 00:10:00";
        String userTime  = "2021-11-11 00:07:00";
        System.out.println(isTimeIn(startTime, endTime, userTime));
    }
    public static Boolean isTimeIn(String time1, String time2, String userTime1) throws ParseException {

        long startTime =  TimeDate(time1);
        long endTime =  TimeDate(time2);
        long userTime =  TimeDate(userTime1);
        return startTime < userTime && endTime > userTime;
    }
    public static Long TimeDate(String time) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date timeDate  =  s.parse(time);
        return  timeDate.getTime();
    }
}
