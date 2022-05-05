package com.br.loja.haunted.Service;

import com.br.loja.haunted.Model.Category;
import com.br.loja.haunted.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();

    }
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public void removeCategoriesById(int id){
        categoryRepository.deleteById(id);

    }
}
