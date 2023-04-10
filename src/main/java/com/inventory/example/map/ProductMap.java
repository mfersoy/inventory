package com.inventory.example.map;

import com.inventory.example.domain.Product;
import com.inventory.example.dto.ProductDTO;
import com.inventory.example.dto.request.ProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.jpa.repository.EntityGraph;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMap {


    Product productRequestToProduct(ProductRequest productRequest);


    ProductDTO productToProductDTO(Product product);


    List<ProductDTO> producsToProductDTOS(List<Product> products);



}
