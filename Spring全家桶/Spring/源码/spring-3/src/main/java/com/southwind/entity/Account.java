package com.southwind.entity;

import lombok.Data;

@Data
public class Account {
    private Integer id;
    private String name;

    public Account() {
        System.out.println("创建了一个 Account 对象");
    }
}
