package com.huazhuCollection;

import java.util.LinkedList;

public class stackList {
    public static void main(String[] args) {
        //LinkedList 可以完成队列和栈的结果 双链表
        //栈
        LinkedList<Object> stack = new LinkedList<>();
        stack.addFirst("第一个子弹");//push
        stack.addFirst("第二个子弹");
        stack.addFirst("第三个子弹");
        stack.addFirst("第四个子弹");
        System.out.println(stack);//[第四个子弹, 第三个子弹, 第二个子弹, 第一个子弹]
        //添加删除
        System.out.println(stack.removeFirst());//第四个子弹  pop
        System.out.println(stack.removeFirst());//第三个子弹
        System.out.println(stack.removeFirst());//第二个子弹
        System.out.println(stack);//第一个子弹

        //队列
        LinkedList<Object> queue = new LinkedList<>();
        queue.addLast("1号");  //offLast
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);//[1号, 2号, 3号, 4号]
        System.out.println(queue.getFirst());//1号
        System.out.println(queue.getFirst());//2号
        System.out.println(queue.getFirst());//3号

    }
}
