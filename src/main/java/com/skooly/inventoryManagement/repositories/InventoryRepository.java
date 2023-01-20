package com.skooly.inventoryManagement.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.skooly.inventoryManagement.models.Inventory;

@Repository
public interface InventoryRepository extends MongoRepository<Inventory,String>{}
