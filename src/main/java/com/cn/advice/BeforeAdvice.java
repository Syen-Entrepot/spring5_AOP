package com.cn.advice;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * @author Syen
 * @date 2019/7/27 0027-上午 10:59
 */
public class BeforeAdvice {


    public void methodBefore(){
        System.out.println("我在方法之前执行...............");
    }

    /*JoinPoint可以获取几乎所有的这个方法的信息*/
    public void before(JoinPoint joinPoint){
    String name= joinPoint.getSignature().getName();

    Object[] args=joinPoint.getArgs();

    System.out.println(Arrays.toString(args));

    System.out.println("method:"+name);

    }

}
