package com.huazhuAPI2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class test5 {
    public static void main(String[] args) {
        LocalDate toDay  = LocalDate.now();
        System.out.println(toDay);
        LocalDate countdownDay = LocalDate.of(2019,8,4);
        Period p  = Period.between(countdownDay,toDay);
/*        Duration between = Duration.between(countdownDay, toDay);
        System.out.println(between.toDays());*/

        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
    }
}
