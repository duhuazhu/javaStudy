package com.huazhuCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class test1 {
    public static void main(String[] args) {
        //���� ���ظ� ������   list����
        Collection<Object> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("false");
        list.add(23);

        //���� ���ظ� ������  set����
        Collection<Object> list1 = new HashSet<>();
        list1.add("java");
        list1.add("java");
        list1.add(23);
        list1.add("false");
        list1.add(978);

        System.out.println(list);
        System.out.println(list1);


    }
}
