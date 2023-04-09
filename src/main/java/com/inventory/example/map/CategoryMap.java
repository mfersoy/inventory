package com.inventory.example.map;


import com.inventory.example.domain.Category;
import com.inventory.example.dto.request.CategoryRequest;
import com.inventory.example.dto.CategoryDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMap {


    Category categoryRequestToCategory(CategoryRequest categoryRequest);

    List<CategoryDTO> map(List<Category> categories);

    CategoryDTO categoryToCategoryDTO (Category category);
}
