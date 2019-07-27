package com.cn.service;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 16:18
 */
public class HelloService {

    public String msg(){
        System.out.println("我是》》》....");
        return "一行白鹭上青天";
    }
    public void exe(){
        System.out.println("执行了exe。。。。。。");
        throw new RuntimeException("我是故意的....");
    }

}
