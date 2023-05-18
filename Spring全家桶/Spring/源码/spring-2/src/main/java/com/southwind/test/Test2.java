package com.southwind.test;

import com.southwind.entity.Classes;
import com.southwind.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Classes classes = (Classes) applicationContext.getBean("classes");
//        Student student = (Student) applicationContext.getBean("student");
        System.out.println(classes);
//        System.out.println(student);
    }
}
