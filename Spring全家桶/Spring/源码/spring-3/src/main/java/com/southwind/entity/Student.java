package com.southwind.entity;

import lombok.*;

@Data
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Classes classes;

    public Student(Integer id, String name, Integer age) {
        System.out.println("通过有参构造创建对象");
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
