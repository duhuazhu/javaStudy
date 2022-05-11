package com.huazhu.creatobject;

import java.util.ArrayList;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
       /* Car c  =new Car();
        c.name = "宝马";
        c.price = 39.2;
        c.start();
        c.run();


        Car c1  = new Car();
        c1.name = "大众";
        c1.price=25.1;
        c1.start();
        c1.run();
        String syscode = "23afg";
        String a1 = "23Afg";
        System.out.println(syscode.equalsIgnoreCase(a1));

        System.out.println(syscode.substring(0,2));
        System.out.println(a1.contains("2"));
        System.out.println(a1.startsWith("23"));
        String[] b1=  a1.split("A");
        System.out.println(Arrays.toString(b1));*/
        //约束规范
    /*    ArrayList<String> list=  new ArrayList();
        list.add("java");
        list.add("javaScript");
        list.add(1,"vue");
        System.out.println(list);*/

        ArrayList list1= new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add("花猪");

//        list1.remove(1);
//        System.out.println(list1);
//        System.out.println(list1.get(1));

       /* for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }*/
        System.out.println(list1.remove("花猪"));
        list1.remove((Integer)1);
        System.out.println(list1);

    }
}
