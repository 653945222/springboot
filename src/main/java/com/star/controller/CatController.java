package com.star.controller;

import com.star.dto.Cat;
import com.star.service.CatService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
@Api(description = "Cat接口详情")
@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    CatService catService;

    @ApiOperation(value = "保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(Cat cat) {
        catService.save(cat);
    }

    @ApiOperation(value = "删除")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(Integer id) {
        catService.delete(id);
    }

    @ApiOperation(value = "查询所有")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Cat> findAll() {
        Iterator<Cat> iterator = catService.findAll().iterator();
        return IteratorUtils.toList(iterator);
    }

    @ApiOperation(value = "通过id查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cat findById(@PathVariable Integer id) {
        return catService.findById(id);
    }

    @ApiOperation(value = "测试异常")
    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public void exception() {
        int i = 1 / 0;
        System.out.println("exception");
    }

    @ApiOperation(value = "通过名称查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "catName", value = "cat的名称", required = true,
                    dataType = "string", paramType = "query")
    })
    @RequestMapping(value = "/findByCatName", method = RequestMethod.GET)
    public List<Cat> findByCatName(String catName) {
        return catService.findByCatName(catName);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Cat findById2(@PathVariable Integer id) {
        return catService.findById2(id);
    }

    @ApiOperation(value = "通过id获取名字")
    @RequestMapping(value = "/name/{id}", method = RequestMethod.GET)
    public String getCatNameById(@PathVariable Integer id) {
        return catService.getCatNameById(id);
    }

    @RequestMapping(value = "/likeName/{name}", method = RequestMethod.GET)
    public List<Cat> likeName(@PathVariable String name) {
        return catService.likeName(name);
    }
}
