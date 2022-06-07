package com.huazhuMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class testMap {
    public static void main(String[] args) {
        /*
         * 统计80个
         * Map
         */
        String[]  charArray = {"A","B","C","D"};
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            stringBuilder.append(charArray[random.nextInt(charArray.length)]);
        }
        //ABCD随机数 80位
        System.out.println(stringBuilder);
        Map<Character,Integer> maps = new HashMap<>();
        for (int j = 0; j <stringBuilder.length() ; j++) {
            char c = stringBuilder.charAt(j);
            if(maps.containsKey(c)){
                maps.put(c, maps.get(c) + 1);
            }else {
                maps.put(c,1);
            }
        }
        System.out.println(maps);
    }
}
