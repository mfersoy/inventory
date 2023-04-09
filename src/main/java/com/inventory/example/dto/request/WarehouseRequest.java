package com.inventory.example.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseRequest {

    @NotBlank(message = "Please provide a name")
    private String name;

    @NotBlank(message = "Please provide a address")
    private String address;

    @NotBlank(message = "Please provide a state (Akdeniz,Karadeniz,Marmara)")
    private String state;

    @NotBlank(message = "Please provide a city")
    private  String city;


}
