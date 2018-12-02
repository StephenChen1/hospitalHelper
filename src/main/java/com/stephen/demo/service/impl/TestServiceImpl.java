package com.stephen.demo.service.impl;

import com.stephen.demo.dao.TestDao;
import com.stephen.demo.entity.TestEntity;
import com.stephen.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao ;

    @Override
    public int insertTest(TestEntity testEntity){
        return testDao.insertTest(testEntity);
    }
}
