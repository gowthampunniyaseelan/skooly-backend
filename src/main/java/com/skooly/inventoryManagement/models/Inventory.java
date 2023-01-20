package com.skooly.inventoryManagement.models;

import java.nio.Buffer;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Inventory {

  @Id
  private String id;
  private String productName;
  private Boolean purchased;
  private List<String> gender;
  private List<String> size;
  private String image;
  private Integer price;
  private Boolean cart;
  

  public Inventory(String id, String productName, Boolean purchased, List<String> gender, List<String> size,String image,Integer price,Boolean cart) {
    this.id = id;
    this.productName = productName;
    this.purchased = purchased;
    this.gender = gender;
    this.size = size;
    this.image = image;
    this.price = price;
    this.cart = cart;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }
  public Boolean getPurchased() {
    return purchased;
  }
  public void setPurchased(Boolean purchased) {
    this.purchased = purchased;
  }
  public List<String> getGender() {
    return gender;
  }
  public void setGender(List<String> gender) {
    this.gender = gender;
  }
  public List<String> getSize() {
    return size;
  }
  public void setSize(List<String> size) {
    this.size = size;
  }  

  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  public Integer getPrice() {
    return price;
  }
  public void setPrice(Integer price) {
    this.price = price;
  }

  public Boolean getCart() {
    return cart;
  }
  public void setCart(Boolean cart) {
    this.cart = cart;
  }

  @Override
  public String toString() {
    return "Inventory [size=" + size + ", Productname=" + productName + ", purchased=" + purchased + ", gender=" + gender + ", image=" + image + "]";
  }
}
