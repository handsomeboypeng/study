package com.southwind.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Integer num;
    private String brand;
    private Double price;

    public Car(Integer num, String brand) {
        this.num = num;
        this.brand = brand;
    }
}
