package com.huazhu.BuyflyDemo;

import java.util.Objects;
import java.util.Scanner;

/*
 * 5-10�� ͷ�Ȳ�9��  ���ò� 8,5 11-4��ͷ�Ȳ�7�� ���ò�6.5��
 * */
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������������Ʊԭ��");
        double price = sc.nextInt();
        System.out.println("���������������Ʊ�·�");
        int month = sc.nextInt();
        if(month>12){
            System.out.println("��������·�������");
            return;
        }
        System.out.println("����������������ͷ�Ȳջ��߾��ò�");
        String type = sc.next();
        if(Objects.equals(type, "���ò�") || Objects.equals(type, "ͷ�Ȳ�" )){
            System.out.println("������Ĳ�����������");
            return;
        }
        double zkPrice;
        if (5 <= month && month <= 10) {
            if (Objects.equals(type, "���ò�")) {
                zkPrice = price * 0.85;
            } else {
                zkPrice = price * 0.9;
            }
        }else{
            if (Objects.equals(type, "���ò�")) {
                zkPrice = price * 0.65;
            } else {
                zkPrice = price * 0.7;
            }
        }
        System.out.println("�۸���:"+zkPrice);
    }
}
