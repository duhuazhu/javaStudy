package com.huazhuCollection;

import java.util.ArrayList;
import java.util.List;

public class listTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Java");
        list.add("Html");
        list.add("python");
        System.out.println(list);
        System.out.println("-----------------");
        System.out.println(list.get(0)); //��ȡ ��д����
        list.set(0,"javaţ��");
        System.out.println("-----------------");
        System.out.println(list);
        list.add("Java");
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println("-----------------");

    }
}
