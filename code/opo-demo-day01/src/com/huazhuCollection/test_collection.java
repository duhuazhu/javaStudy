package com.huazhuCollection;

import java.util.*;
import java.util.function.Consumer;

public class test_collection {
    public static void main(String[] args) {
        Collection<Object> list = new ArrayList<>();
        list.add("Í®Í®");
//        System.out.println(list.add("123"));
        list.add("ËïÎò¿Õ");
        list.add("¶¼»¨Öù");
        list.add("Õç‹Ö´«");
        System.out.println(list);

       /* for (Object o : list) {
            System.out.println(o);
        }*/
        /*list.forEach(new Consumer<Object>() {
            public void accept(Object s){
                System.out.println(s);
            }
        });*/
         list.forEach(s->{
            System.out.println(s);
        });
        System.out.println("------------------------");
    /*      list.clear();
        System.out.println(list);*/
        //System.out.println(list.isEmpty());
    //        System.out.println(list.size());
    //        list.remove("123");
    //        System.out.println(list);
    //        Object[] arrs = list.toArray();
    //        System.out.println(arrs);
    //        System.out.println(Arrays.toString(arrs));

        Iterator<Object> iterator = list.iterator();
      /*  Object ele = iterator.next();
        System.out.println(ele);
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/
        while (iterator.hasNext()){
            Object ele = iterator.next();
            System.out.println(ele);
        }

    }
}
