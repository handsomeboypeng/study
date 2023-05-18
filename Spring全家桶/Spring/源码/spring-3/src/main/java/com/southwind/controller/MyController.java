package com.southwind.controller;

import com.southwind.service.MyService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Setter
@Controller
public class MyController {

    @Autowired
    private MyService myService;

    /**
     * 模拟客户端请求
     */
    public String service(Double score){
        return myService.doService(score);
    }
}
