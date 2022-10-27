package com.tt.run;

import com.tt.bean.Business;
import com.tt.bean.Movie;
import com.tt.bean.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class movieSystem {
    /**
     * 定义系统容器存储数据
     * 1.存储很多用户 （客户对象，商家对象）
     */
    private static final List<User> All_USERS  = new ArrayList<>();

    /**
     * 2.存储系统全部商家排片信息
     *   商家1  =  【p1,p2,p3】
     *   .. 数组
     * @param args
     */
    public  static Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();



    public static void main(String[] args){

    }
}
