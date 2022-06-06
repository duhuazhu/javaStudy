package com.huazhuMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("mac",30);
        maps.put("book",40);
        maps.put("watch",100);
        maps.put("iPhone",10);
        maps.forEach((key,value)->{
            System.out.println(key+"====>"+value);
        });


        //map ×ªset¶ÔÏó
        Set<Map.Entry<String,Integer>> entries =maps.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
