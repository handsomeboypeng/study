package com.southwind.repository.impl;

import com.southwind.repository.MyRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {
    @Override
    public String doRepository(Double score) {
        String result = "";
        if(score < 60){
            result = "不及格";
        }
        if(score >= 60 && score < 80){
            result = "合格";
        }
        if(score >= 80){
            result = "优秀";
        }
        return result;
    }
}
