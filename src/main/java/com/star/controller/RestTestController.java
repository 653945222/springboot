package com.star.controller;

import com.star.dto.Cat;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liuquan on 2018/3/22.
 */
@RestController
@RequestMapping("/rest")
public class RestTestController {

    @Autowired
    RestTemplate restTemplate;

    @ApiOperation(value = "通过id查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cat findById(@PathVariable Integer id) {
        return restTemplate.getForObject("http://localhost:8080/cat/id/"+id,Cat.class);
    }
}
