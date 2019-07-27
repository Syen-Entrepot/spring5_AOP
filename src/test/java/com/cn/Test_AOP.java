package com.cn;

import com.cn.service.HelloService;
import com.cn.service.ProviderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Syen
 * @date 2019/7/27 0027-上午 11:11
 */
public class Test_AOP {
    @Test
    public void m1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        /*如果不是spring容器所管理的bean，那么织入行为无法生效的*/
       ProviderService providerService= ctx.getBean("providerService1",ProviderService.class);
        //ProviderService providerService=new ProviderService();
      /*  providerService.add();
        providerService.add("nice");
        providerService.add("nice",6);*/
      //providerService.add();
      providerService.add("很好");


    }
    @Test
    public void m2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        /*如果不是spring容器所管理的bean，那么织入行为无法生效的*/
       // ProviderService providerService= ctx.getBean("providerService1",ProviderService.class);
        HelloService helloService=ctx.getBean("helloService",HelloService.class);
        helloService.msg();


    }
    @Test
    public void m3(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        /*如果不是spring容器所管理的bean，那么织入行为无法生效的*/
        // ProviderService providerService= ctx.getBean("providerService1",ProviderService.class);
        HelloService helloService=ctx.getBean("helloService",HelloService.class);
        helloService.exe();


    }
    @Test
    public void m4(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        /*如果不是spring容器所管理的bean，那么织入行为无法生效的*/
        // ProviderService providerService= ctx.getBean("providerService1",ProviderService.class);
        HelloService helloService=ctx.getBean("helloService",HelloService.class);
        helloService.msg();


    }
}
