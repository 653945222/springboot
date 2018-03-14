package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by liuquan on 2018/3/9.
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {
    @RequestMapping("hello")
    public String hello(Map<String,Object> map){
        map.put("name", "star");
        return "hello";
    }
}
