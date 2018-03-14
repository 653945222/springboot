package com.star.mapper;

import com.star.dto.Cat;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by liuquan on 2018/3/14.
 */
public interface CatMapper {
    @Select("select * from cat where id = #{id}")
    public Cat findById(Integer id);

    @Select("select cat_name from cat where id = #{id}")
    public String getCatNameById(Integer id);

    @Select("select * from cat where cat_name like concat('%',#{cat_name},'%')")
    public List<Cat> likeName(String cat_name);
}
