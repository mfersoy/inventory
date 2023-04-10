package com.inventory.example.service;

import com.inventory.example.domain.Category;
import com.inventory.example.dto.request.CategoryRequest;
import com.inventory.example.dto.CategoryDTO;
import com.inventory.example.exception.ResourceNotFoundException;
import com.inventory.example.exception.message.ErrorMessage;
import com.inventory.example.map.CategoryMap;
import com.inventory.example.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMap categoryMap;

    @Autowired
    private CategoryRepository categoryRepository;

    public void saveCategory(CategoryRequest categoryRequest){

        Category category = categoryMap.categoryRequestToCategory(categoryRequest);

        categoryRepository.save(category);

    }

    public List<CategoryDTO> getAllCategory(){
        List<Category> categories = categoryRepository.findAll();

        return categoryMap.map(categories);
    }

    public Category geyByIdCategory(Long id){
        Category category = categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format(ErrorMessage.CATEGORY_NOT_FOUND)));
        return category;
    }

    public CategoryDTO getById(Long id){
        Category category = categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format(ErrorMessage.CATEGORY_NOT_FOUND)));

        return categoryMap.categoryToCategoryDTO(category);

    }
}
