package com.inventory.example.map;

import com.inventory.example.domain.Warehouse;
import com.inventory.example.dto.request.WarehouseRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WarehouserMap {

    Warehouse warehouseRequestToWarehouser(WarehouseRequest warehouseRequest);
}
