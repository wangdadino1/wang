package com.wang.index.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
/*@PropertySource("classpath:application.yml")//读取application.yml文件*/
public class indexController {
/*    @Value("${server.servlet.context-path}")
    private String contextPath;*/
    @RequestMapping("")
    public String toIndex(/*Model model*/){
        //model.addAttribute("contextPath",contextPath);
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
