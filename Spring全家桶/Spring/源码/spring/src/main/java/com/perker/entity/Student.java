package com.perker.entity;

import lombok.Data;

@Data
//lombok中有@Getter @Setter 无参构造器等可以选择
public class Student {
    //为了避开基本数据类型的坑，阿里巴巴约定实体类不使用基本数据类型！统一使用包装类！
    private Integer id;
    private String name;
    private Integer age;
}
