package com.inventory.example.service;

import com.inventory.example.domain.Warehouse;
import com.inventory.example.dto.request.WarehouseRequest;
import com.inventory.example.map.WarehouserMap;
import com.inventory.example.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {

    @Autowired
    private WarehouserMap warehouserMap;

    @Autowired
    private WarehouseRepository warehouseRepository;

    public void saveWarehouser (WarehouseRequest warehouseRequest){

        Warehouse warehouse = warehouserMap.warehouseRequestToWarehouser(warehouseRequest);

         warehouseRepository.save(warehouse);
    }
}
