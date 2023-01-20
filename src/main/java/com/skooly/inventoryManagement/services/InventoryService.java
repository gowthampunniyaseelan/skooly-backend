package com.skooly.inventoryManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skooly.inventoryManagement.models.Inventory;
import com.skooly.inventoryManagement.repositories.InventoryRepository;

@Service
public class InventoryService {

  @Autowired
  private InventoryRepository inventoryRepository;

  public ResponseEntity<Inventory> createInventory(Inventory inventory){
    return ResponseEntity.status(201).body(inventoryRepository.save(inventory));
  }

  public ResponseEntity<Optional<Inventory>> updateInventory(String inventoryId,Inventory inventory){
    Optional<Inventory> inventories = inventoryRepository.findById(inventoryId);
    Inventory updateInventory  = inventories.get();

    if(inventory.getPurchased() != null){
      updateInventory.setPurchased(inventory.getPurchased());
    };

    if(!inventory.getGender().isEmpty()){
      updateInventory.setGender(inventory.getGender());
    };

    if(!inventory.getSize().isEmpty()){
      updateInventory.setSize(inventory.getSize());
    };

    if(inventory.getImage() != ""){
    updateInventory.setImage(inventory.getImage());
    }

    if(inventory.getProductName() != ""){
      updateInventory.setProductName(inventory.getProductName());
    }
     
    if(inventory.getPrice() > 0){
      updateInventory.setPrice(inventory.getPrice());
    }

    if(inventory.getCart() != null){
      updateInventory.setCart(inventory.getCart());
    }

    inventoryRepository.save(updateInventory);

    System.out.println(inventories);

    return ResponseEntity.ok(inventories);
  }

  public List<Inventory> getInventory(){
    return inventoryRepository.findAll();
  }
}
