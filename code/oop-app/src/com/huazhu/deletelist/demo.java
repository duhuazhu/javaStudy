package com.huazhu.deletelist;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 98, 77, 66, 89, 79, 50, 100);
        for (int i = 0; i < list.size(); i++) {
            int score = list.get(i);
            if(score < 80){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
