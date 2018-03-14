package com.star.repository;

import com.star.dto.Cat;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by liuquan on 2018/3/9.
 */
public interface Cat2Repository extends PagingAndSortingRepository<Cat,Integer> {
    List<Cat> findByCatName(String catName, Pageable pageable);
}
