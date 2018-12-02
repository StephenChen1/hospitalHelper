package com.stephen.demo.controller;


import com.stephen.demo.entity.TestEntity;
import com.stephen.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService ;

    /**
     *
     * @param testEntity
     * @return
     */
    @RequestMapping(value = "/insert" ,method = RequestMethod.POST)
    public Map<String,Object> test(@RequestBody TestEntity testEntity){

        Map<String , Object> resMap = new HashMap<>();
        System.out.println("传进来的参数："+ testEntity);
        //调用service
        int result = testService.insertTest(testEntity);
        if(result == 1){
            resMap.put("success",true);
            resMap.put("msg","添加成功");

        }else {
            resMap.put("success",false);
            resMap.put("msg","添加失败");
        }
        return resMap ;
    }





}
