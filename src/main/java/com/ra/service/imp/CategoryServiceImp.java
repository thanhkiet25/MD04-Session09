package com.ra.service.imp;

import com.ra.model.Category;
import com.ra.repository.CategoryRepository;
import com.ra.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {

return categoryRepository.findAll();
    }

    @Override
    public boolean save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public boolean update(Category category) {
        return categoryRepository.update(category);
    }

    @Override
    public boolean delete(Long id) {
        return categoryRepository.delete(id);
    }
}
