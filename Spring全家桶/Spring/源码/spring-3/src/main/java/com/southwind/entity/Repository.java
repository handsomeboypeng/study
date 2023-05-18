package com.southwind.entity;

import com.southwind.myinterface.MyInterface;
import com.southwind.myinterface.impl.MyImplement1;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component(value = "myrepo")
public class Repository {

    @Autowired
    @Qualifier(value = "ds")
    private DataSource dataSource;

    @Autowired
    @Qualifier(value = "myImplement2")
    private MyInterface myInterface;
}
