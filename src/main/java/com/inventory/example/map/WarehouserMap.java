package com.inventory.example.map;

import com.inventory.example.domain.Warehouse;
import com.inventory.example.dto.WarehouseDTO;
import com.inventory.example.dto.request.WarehouseRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WarehouserMap {

    Warehouse warehouseRequestToWarehouser(WarehouseRequest warehouseRequest);

    List<WarehouseDTO> map(List<Warehouse> warehouse);

    WarehouseDTO warehouseToWarehouseDTO(Warehouse warehouse);
}
