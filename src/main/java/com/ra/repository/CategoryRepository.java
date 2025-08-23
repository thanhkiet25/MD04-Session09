package com.ra.repository;

import com.ra.model.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();

    boolean save(Category category);

    Category findById(Long id);

    boolean update(Category category);

    boolean delete(Long id);
}
