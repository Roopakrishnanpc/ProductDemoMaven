package com.ProductManagement.ProductDemoMaven.Entity;


public class Product {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String name;
private String type;
private String place;
private int warranty;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public int getWarranty() {
	return warranty;
}
public void setWarranty(int warranty) {
	this.warranty = warranty;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String name, String type, String place, int warranty) {
	super();
	this.name = name;
	this.type = type;
	this.place = place;
	this.warranty = warranty;
}
@Override
public String toString() {
	return "Product [id+" + id + " , name=" + name + ", type=" + type + ", place=" + place + ", warranty=" + warranty + "]";
}
}

