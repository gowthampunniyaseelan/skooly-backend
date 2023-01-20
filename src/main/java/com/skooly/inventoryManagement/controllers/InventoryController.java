package com.skooly.inventoryManagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skooly.inventoryManagement.models.Inventory;
import com.skooly.inventoryManagement.services.InventoryService;

@RestController
@CrossOrigin
public class InventoryController {
  @Autowired
  private InventoryService inventoryService;

  @PostMapping("/inventory-management/inventory")
  public ResponseEntity<Inventory> createInventory(@RequestBody Inventory inventory){
    return inventoryService.createInventory(inventory);
  }

  @PutMapping("/inventory-management/inventory/{inventoryId}")
  public ResponseEntity<Optional<Inventory>> updateInventory(@PathVariable String inventoryId,@RequestBody Inventory inventory){
    return inventoryService.updateInventory(inventoryId, inventory);
  } 

  @GetMapping("/inventory-management/inventory")
  public List<Inventory> getInventory(){
    return inventoryService.getInventory();
  }
}
