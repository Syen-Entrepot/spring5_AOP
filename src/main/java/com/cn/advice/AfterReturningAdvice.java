package com.cn.advice;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 16:09
 */

public class AfterReturningAdvice {


    public void afterReturning(String re){

        System.out.println("野火烧不尽，春风吹又生");
        System.out.println("返回值。。。。。"+re);
    }
}
