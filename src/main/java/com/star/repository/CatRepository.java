package com.star.repository;

import com.star.dto.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by liuquan on 2018/3/9.
 */
public interface CatRepository extends CrudRepository<Cat,Integer>{
}
