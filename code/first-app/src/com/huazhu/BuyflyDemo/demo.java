package com.huazhu.BuyflyDemo;

import java.util.Objects;
import java.util.Scanner;

/*
 * 5-10月 头等舱9者  经济舱 8,5 11-4月头等舱7折 经济舱6.5折
 * */
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入依次输入机票原价");
        double price = sc.nextInt();
        System.out.println("请输入依次输入机票月份");
        int month = sc.nextInt();
        if(month>12){
            System.out.println("您输入的月份有问题");
            return;
        }
        System.out.println("请输入依次输入是头等舱或者经济舱");
        String type = sc.next();
        if(Objects.equals(type, "经济舱") || Objects.equals(type, "头等舱" )){
            System.out.println("您输入的舱种类有问题");
            return;
        }
        double zkPrice;
        if (5 <= month && month <= 10) {
            if (Objects.equals(type, "经济舱")) {
                zkPrice = price * 0.85;
            } else {
                zkPrice = price * 0.9;
            }
        }else{
            if (Objects.equals(type, "经济舱")) {
                zkPrice = price * 0.65;
            } else {
                zkPrice = price * 0.7;
            }
        }
        System.out.println("价格是:"+zkPrice);
    }
}
