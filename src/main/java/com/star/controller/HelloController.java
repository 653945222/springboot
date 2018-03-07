package com.star.controller;

import com.star.dto.Demo;
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

    /**
     * spring默认的json解析框架是jackson
     * @return
     */
    @RequestMapping("getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("star");

        return demo;
    }
}
