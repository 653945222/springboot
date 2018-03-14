package com.star.controller;

import com.star.dto.Cat;
import com.star.service.CatService;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * Created by liuquan on 2018/3/9.
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    CatService catService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public void save(Cat cat){
        catService.save(cat);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public void delete(Integer id){
        catService.delete(id);
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Cat> findAll(){
        Iterator<Cat> iterator = catService.findAll().iterator();
        return IteratorUtils.toList(iterator);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Cat findById(@PathVariable Integer id){
        return catService.findById(id);
    }
    @RequestMapping(value = "/exception",method = RequestMethod.GET)
    public void exception(){
        int i = 1 / 0;
        System.out.println("exception");
    }
    @RequestMapping(value = "/findByCatName",method = RequestMethod.GET)
    public  List<Cat> findByCatName(String catName){
        return catService.findByCatName(catName);
    }
}
