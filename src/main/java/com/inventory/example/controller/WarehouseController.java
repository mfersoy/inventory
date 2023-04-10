package com.inventory.example.controller;

import com.inventory.example.domain.Warehouse;
import com.inventory.example.dto.WarehouseDTO;
import com.inventory.example.dto.request.WarehouseRequest;
import com.inventory.example.dto.response.IResponse;
import com.inventory.example.dto.response.ResponseMessage;
import com.inventory.example.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @PostMapping("/save")
    public ResponseEntity<IResponse> saveWarehouse(@RequestBody @Valid WarehouseRequest warehouseRequest){

       warehouseService.saveWarehouser(warehouseRequest);

       IResponse iResponse = new IResponse(ResponseMessage.WAREHOUSER_SAVED_MESSAGE,true);
       return ResponseEntity.ok(iResponse);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<WarehouseDTO>> getAllWarehouse(){

        List<WarehouseDTO> warehouseDTOS = warehouseService.getAllWarehouser();
        return ResponseEntity.ok(warehouseDTOS);

    }

    @GetMapping("getById/{id}")
    public ResponseEntity<WarehouseDTO> getById(@PathVariable Long id){
        WarehouseDTO warehouseDTO= warehouseService.getById(id);
        return ResponseEntity.ok(warehouseDTO);
    }
}
