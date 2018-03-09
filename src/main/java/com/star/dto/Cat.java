package com.star.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by liuquan on 2018/3/9.
 * 1. 当使用@Entity进行实体类的持久化操作，当JPA检测到我们的实体类当中有
 * @Entity 注解的时候，会在数据库中生成相应的表结构信息。
 *
 * 如何执行主键以及主键的生成策略？
 * 2. 使用@Id指定主键
 */
@Entity
public class Cat {

    /***
     * 使用@Id指定主键
     * 指定主键的生成策略，mysql默认的是自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;//主键
    private String catName;//姓名
    private int catAge;//年龄

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
}
