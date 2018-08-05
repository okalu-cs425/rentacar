package com.obinna.spring.jpademo.rentacar.controller.restctrl;

import com.obinna.spring.jpademo.rentacar.model.Category;
import com.obinna.spring.jpademo.rentacar.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/rentacar/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public List<Category> categories() {
        return categoryService.findAll();
    }

    @PostMapping("/add")
    public Category addCategory(@Valid @RequestBody Category category) {
        return categoryService.save(category);
    }

}
