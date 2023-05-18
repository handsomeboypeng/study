package com.southwind.test;

import com.southwind.entity.Car;
import com.southwind.factory.InstanceCarFactory;
import com.southwind.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    public static void main(String[] args) {
//        Car car = StaticCarFactory.getCar(1);
//        System.out.println(car);

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-factory.xml");
//        Car car1 = (Car) applicationContext.getBean("car1");
//        System.out.println(car1);

//        //实例化工厂类
//        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
//        //获取Car
//        Car car = instanceCarFactory.getCar(1);
//        System.out.println(car);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car2);

    }
}
