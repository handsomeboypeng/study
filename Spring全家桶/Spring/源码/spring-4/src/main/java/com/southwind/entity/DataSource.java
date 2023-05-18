package com.southwind.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component(value = "ds")
public class DataSource {
    @Value("root")
    private String user;
    @Value("root")
    private String password;
    @Value("jdbc:mysql://localhost:3308/library")
    private String url;
    @Value("com.mysql.cj.jdbc.Driver")
    private String driverName;
}
