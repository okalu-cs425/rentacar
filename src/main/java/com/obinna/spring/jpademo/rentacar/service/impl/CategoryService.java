package com.obinna.spring.jpademo.rentacar.service.impl;

import com.obinna.spring.jpademo.rentacar.model.Category;
import com.obinna.spring.jpademo.rentacar.repository.ICategoryRepository;
import com.obinna.spring.jpademo.rentacar.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Integer categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

}
