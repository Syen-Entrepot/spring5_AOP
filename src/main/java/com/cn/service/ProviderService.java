package com.cn.service;

/**
 * @author Syen
 * @date 2019/7/27 0027-上午 11:02
 */
public class ProviderService {

    public void add(){
       // System.out.println("我在方法之前执行...........");
        System.out.println("添加一个供应商......");
    }
    public void add(String name){
        System.out.println("加了一个参数：......."+name);
    }

    public void add(String name,int num){
        System.out.println("加了两个参数：......"+name+",数量为:"+num);
    }

}
