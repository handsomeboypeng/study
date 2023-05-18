package com.southwind.test;

import com.southwind.controller.MyController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
        //客户端请求
        MyController myController = applicationContext.getBean(MyController.class);
        String result = myController.service(new Double(33));
        System.out.println(result);
    }
}
