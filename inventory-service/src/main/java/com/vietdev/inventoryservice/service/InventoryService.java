package com.vietdev.inventoryservice.service;

import com.vietdev.inventoryservice.inventory.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public Boolean isInStock(String skuCode) {
        return inventoryRepository.findFirstBySkuCode(skuCode).isPresent();
    }
}
