package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    public Category getCategoryById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Category addCategory(Category category) {
        return repository.save(category);
    }

    public Category updateCategory(Long id, Category categoryDetails) {
        Optional<Category> categoryOptional = repository.findById(id);
        if (categoryOptional.isPresent()) {
            Category category = categoryOptional.get();
            category.setName(categoryDetails.getName());
            category.setDescription(categoryDetails.getDescription());
            return repository.save(category);
        }
        return null;
    }

    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }
}
