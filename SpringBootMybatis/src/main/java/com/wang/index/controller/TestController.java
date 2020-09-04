/*
package com.wang.index.controller;

import com.alibaba.fastjson.JSON;
import com.wang.api.mybatisData.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private UserService userService;
    @GetMapping("test")
    public String test(){
        //视频解析接口 https://z1.m1907.cn/?jx=url=https://v.qq.com/x/cover/gothgwl98bmq6es.html
        //redisTemplate.opsForValue().set("myKey","myValue");
        System.out.println(redisTemplate.opsForValue().get("wang"));
        return redisTemplate.opsForValue().get("wang");
    }
    @RequestMapping("test2")
    @ResponseBody
    public String test2(String name,String sex,String age){
        List <Map <String,Object>> list= new ArrayList<>();
        Map <String,Object> map =new HashMap<>();
        map.put("name",name);
        map.put("sex",sex);
        map.put("age",age);
        list.add(map);
        String inventoryResultStr = JSON.toJSON(list).toString();
        redisTemplate.opsForValue().set("person",inventoryResultStr);
        */
/* for(int i=0;i<100000;i++){
            redisTemplate.opsForValue().set("person",inventoryResultStr);
        }*//*

        return redisTemplate.opsForValue().get("person");
    }
    @RequestMapping("test3")
    @ResponseBody
    public String test3(){
*/
/*        List userList = userService.findById();
        String inventoryResultStr = JSON.toJSON(userList).toString();
        redisTemplate.opsForValue().set("userList",inventoryResultStr);*//*

        return redisTemplate.opsForValue().get("userList");
    }
}
*/
