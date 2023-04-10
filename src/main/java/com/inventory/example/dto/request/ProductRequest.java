package com.inventory.example.dto.request;

import com.inventory.example.domain.Category;
import io.micrometer.core.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    @NotBlank(message = "Please provide a name")
    private String name;

    @NotNull(message = "Please provide amount of product")
    private Integer number;

}
