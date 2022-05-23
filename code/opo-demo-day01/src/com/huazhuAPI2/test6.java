package com.huazhuAPI2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test6 {
    public static void main(String[] args) {
        String n = "3232";
        System.out.println(n.matches("\\d{6,20}"));
        Pattern compile = Pattern.compile("\\d");
        Matcher matcher = compile.matcher("3232dsadas23232");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
