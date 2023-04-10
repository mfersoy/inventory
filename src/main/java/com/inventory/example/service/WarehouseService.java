package com.inventory.example.service;

import com.inventory.example.domain.Warehouse;
import com.inventory.example.dto.WarehouseDTO;
import com.inventory.example.dto.request.WarehouseRequest;
import com.inventory.example.exception.ResourceNotFoundException;
import com.inventory.example.exception.message.ErrorMessage;
import com.inventory.example.map.WarehouserMap;
import com.inventory.example.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<WarehouseDTO> getAllWarehouser(){

        List<Warehouse> warehouses = warehouseRepository.findAll();

        return warehouserMap.map(warehouses);

    }

    public Warehouse getByIdWarehouse(Long id){
        Warehouse warehouse = warehouseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format(ErrorMessage.WAREHOUSER_NOT_FOUND)));
        return  warehouse;
    }

    public WarehouseDTO getById(Long id){
        Warehouse warehouse = warehouseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format(ErrorMessage.WAREHOUSER_NOT_FOUND)));

        return warehouserMap.warehouseToWarehouseDTO(warehouse);
    }
}
