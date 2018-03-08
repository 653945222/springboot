package com.star.dto;


import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 这是一个测试实体累
 */
public class Demo {
    private int id;
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;//创建时间
    @JSONField(serialize = false)
    private String remarks;//备注信息
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
