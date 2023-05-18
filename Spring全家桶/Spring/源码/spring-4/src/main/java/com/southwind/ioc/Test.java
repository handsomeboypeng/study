package com.southwind.ioc;

import com.southwind.entity.Car;
import org.springframework.context.ApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("spring-ioc.xml");
        Car car = (Car) applicationContext.getBean("car1");
        System.out.println(car);
    }
}
