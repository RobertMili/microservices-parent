package com.example.inventorydemo.controller;

import com.example.inventorydemo.dto.InventoryResponse;
import com.example.inventorydemo.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;


    // http://localhost:8082/api/inventory/iphone_13,iphone13-red

    // http://localhost:8082/api/inventory?skuCode=iphone_13&skuCode=iphone13-red
    @GetMapping
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
