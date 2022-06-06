package com.huazhucollectionDemo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> names  =new ArrayList<>();
        Collections.addAll(names,"qq","ww","aa");
        System.out.println(names);
        Collections.shuffle(names);
        System.out.println(names);
    }
}
