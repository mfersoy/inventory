package com.inventory.example.dto;

import com.inventory.example.domain.Category;
import com.inventory.example.domain.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Long id;

    private String name;

    private Integer number;

    private String categories ;

    private String warehouses;
}
