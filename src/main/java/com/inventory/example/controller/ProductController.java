package com.inventory.example.controller;

import com.inventory.example.dto.ProductDTO;
import com.inventory.example.dto.request.ProductRequest;
import com.inventory.example.dto.response.IResponse;
import com.inventory.example.dto.response.ResponseMessage;
import com.inventory.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/save/{categoryid}")
    public ResponseEntity<IResponse> save(@RequestBody @Valid ProductRequest productRequest, @PathVariable Long categoryid,@RequestParam("warehouseid") Long warehouseid){
        productService.saveProduct(productRequest,categoryid,warehouseid);

        IResponse iResponse = new IResponse(ResponseMessage.PRODUCT_SAVED_MESSAGE,true);

        return  ResponseEntity.ok(iResponse);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ProductDTO>> getAll(){

       List<ProductDTO> productDTOS= productService.getAllProducts();

       return ResponseEntity.ok(productDTOS);
    }


}
