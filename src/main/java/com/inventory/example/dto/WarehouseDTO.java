package com.inventory.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseDTO {

    private Long id;

    private String name;

    private String address;

    private String state;

    private String city;
}
