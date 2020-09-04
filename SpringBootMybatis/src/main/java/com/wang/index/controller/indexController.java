package com.wang.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * wangxian
 * 主页面的控制器
 */
@Controller
@RequestMapping("/")
public class indexController {
    @RequestMapping("")
    public String toIndex(){
        return "index2";
    }
    @RequestMapping("/test")
    @ResponseBody
    public Object test(String pzwh,String ajh,String gddx,String region,String [] value1){

        Map map = new HashMap();
        map.put("user","王献");
        map.put("sex","男");
        map.put("address","北京市丰台区");
        return map;
    }

}
