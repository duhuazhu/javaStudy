package com.huazhu.logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//目标：快速搭建logback日志框架 记录程序执行情况 到控制台 到文件中
public class Logback{
    // 创建logback的日志对象 代表了日志技术
    public static  final  Logger LOGGER =  LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行了");
            LOGGER.info("开始记录第二条日志了");
            int a  = 10;
            int b = 0;
            LOGGER.trace("a=" + a);
            LOGGER.trace("b=" + b);
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("功能出现异常," + e);
        }
    }
}