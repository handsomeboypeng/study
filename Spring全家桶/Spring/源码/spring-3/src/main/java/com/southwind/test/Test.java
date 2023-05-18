package com.southwind.test;

import com.southwind.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //传统的开发方式，手动创建对象
//        Student student = new Student();
//        System.out.println(student);

        //IoC容器自动创建对象，开发者只需要取出对象即可
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Student student = (Student)applicationContext.getBean("student");
//        System.out.println(student);

        Student student = (Student) applicationContext.getBean("student3");
        System.out.println(student);
    }
}
