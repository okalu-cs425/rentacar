package com.obinna.spring.jpademo.rentacar.repository;

import com.obinna.spring.jpademo.rentacar.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("categoryRepository")
public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
