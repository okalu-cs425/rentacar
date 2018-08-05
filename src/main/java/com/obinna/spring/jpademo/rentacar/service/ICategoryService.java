package com.obinna.spring.jpademo.rentacar.service;

import com.obinna.spring.jpademo.rentacar.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();
    Category findById(Integer categoryId);
    Category save(Category category);

}
