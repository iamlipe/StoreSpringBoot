package com.iamlipe.store.services;

import com.iamlipe.store.entities.Category;
import com.iamlipe.store.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> user = repository.findById(id);
        return user.orElse(null);
    }
}
