package com.southwind.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;

    public User() {
        System.out.println("创建了一个 User 对象");
    }
}
