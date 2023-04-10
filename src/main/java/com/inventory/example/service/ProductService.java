package com.inventory.example.service;

import com.inventory.example.domain.Category;
import com.inventory.example.domain.Product;
import com.inventory.example.domain.Warehouse;
import com.inventory.example.dto.ProductDTO;
import com.inventory.example.dto.request.ProductRequest;
import com.inventory.example.map.ProductMap;
import com.inventory.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMap productMap;

    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private CategoryService categoryService;

    public void saveProduct(ProductRequest productRequest, Long categoryid, Long warehouseid){

        Warehouse warehouse = warehouseService.getByIdWarehouse(warehouseid);
        Category category = categoryService.geyByIdCategory(categoryid);


        Product product = new Product();

        product.setName(productRequest.getName());
        product.setNumber(productRequest.getNumber());
        product.setWarehouses(warehouse);
        product.setCategories(category);

        productRepository.save(product);
    }

    public List<ProductDTO> getAllProducts(){

        List<Product> products = productRepository.findAll();

        return productMap.producsToProductDTOS(products);

    }
}
