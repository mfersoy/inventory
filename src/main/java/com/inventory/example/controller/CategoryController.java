package com.inventory.example.controller;

import com.inventory.example.dto.request.CategoryRequest;
import com.inventory.example.dto.response.IResponse;
import com.inventory.example.dto.response.ResponseMessage;
import com.inventory.example.dto.CategoryDTO;
import com.inventory.example.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save")
    public ResponseEntity<IResponse> saveCategory(@RequestBody @Valid CategoryRequest categoryRequest){
        categoryService.saveCategory(categoryRequest);
        IResponse iResponse = new IResponse(ResponseMessage.CATEGORY_SAVED_MESSAGE,true);

        return ResponseEntity.ok(iResponse);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CategoryDTO>> getAllCategory(){
        List<CategoryDTO> categoryDTOS = categoryService.getAllCategory();

        return ResponseEntity.ok(categoryDTOS);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<CategoryDTO> getCategoryById(@PathVariable Long id){
        CategoryDTO categoryDTO = categoryService.getById(id);
        return ResponseEntity.ok(categoryDTO);
    }

}
