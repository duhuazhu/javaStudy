package com.huazhuCollection;

import java.util.LinkedList;

public class stackList {
    public static void main(String[] args) {
        //LinkedList ������ɶ��к�ջ�Ľ�� ˫����
        //ջ
        LinkedList<Object> stack = new LinkedList<>();
        stack.addFirst("��һ���ӵ�");//push
        stack.addFirst("�ڶ����ӵ�");
        stack.addFirst("�������ӵ�");
        stack.addFirst("���ĸ��ӵ�");
        System.out.println(stack);//[���ĸ��ӵ�, �������ӵ�, �ڶ����ӵ�, ��һ���ӵ�]
        //���ɾ��
        System.out.println(stack.removeFirst());//���ĸ��ӵ�  pop
        System.out.println(stack.removeFirst());//�������ӵ�
        System.out.println(stack.removeFirst());//�ڶ����ӵ�
        System.out.println(stack);//��һ���ӵ�

        //����
        LinkedList<Object> queue = new LinkedList<>();
        queue.addLast("1��");  //offLast
        queue.addLast("2��");
        queue.addLast("3��");
        queue.addLast("4��");
        System.out.println(queue);//[1��, 2��, 3��, 4��]
        System.out.println(queue.getFirst());//1��
        System.out.println(queue.getFirst());//2��
        System.out.println(queue.getFirst());//3��

    }
}
