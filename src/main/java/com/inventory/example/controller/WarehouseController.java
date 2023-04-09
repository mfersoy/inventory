package com.inventory.example.controller;

import com.inventory.example.domain.Warehouse;
import com.inventory.example.dto.request.WarehouseRequest;
import com.inventory.example.dto.response.IResponse;
import com.inventory.example.dto.response.ResponseMessage;
import com.inventory.example.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    public ResponseEntity<IResponse> saveWarehouse(@RequestBody @Valid WarehouseRequest warehouseRequest){

       warehouseService.saveWarehouser(warehouseRequest);

       IResponse iResponse = new IResponse(ResponseMessage.WAREHOUSER_SAVED_MESSAGE,true);
       return ResponseEntity.ok(iResponse);

    }
}
