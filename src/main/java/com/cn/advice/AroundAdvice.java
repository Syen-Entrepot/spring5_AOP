package com.cn.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 16:41
 */
public class AroundAdvice {
    public Object around(ProceedingJoinPoint pip){
        try {
            System.out.println("灯红酒绿.....");
           Object proceed= pip.proceed();
           return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }


    }
}
