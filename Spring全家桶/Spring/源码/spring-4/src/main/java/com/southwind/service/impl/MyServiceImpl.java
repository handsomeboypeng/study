package com.southwind.service.impl;

import com.southwind.repository.MyRepository;
import com.southwind.service.MyService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Setter
@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private MyRepository myRepository;

    @Override
    public String doService(Double score) {
        return myRepository.doRepository(score);
    }
}
