package com.star.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuquan on 2018/2/28.
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
}
