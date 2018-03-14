package com.star.service;

import com.star.dto.Cat;
import com.star.repository.Cat2Repository;
import com.star.repository.CatRepository;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Iterator;
import java.util.List;

/**
 * Created by liuquan on 2018/3/9.
 */
@Service
public class CatService {
    @Resource
    CatRepository catRepository;
    @Resource
    Cat2Repository cat2Repository;

    @Transactional
    public void save(Cat cat) {
        catRepository.save(cat);
    }

    @Transactional
    public void delete(Integer id) {
        catRepository.delete(id);
    }

    public List<Cat> findAll() {
        Iterator<Cat> iterator = catRepository.findAll().iterator();
        return IteratorUtils.toList(iterator);
    }

    public Cat findById(Integer id) {
        return catRepository.findOne(id);
    }

    public List<Cat> findByCatName(String catName) {
        return cat2Repository.findByCatName(catName,new PageRequest(1,10));
    }
}
