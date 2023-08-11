package com.sruthi.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product 
{
  @Id
  @Column(name="prod_id")
  private String productid;
  @Column(name="prod_name")
  private String productname;
  private double price;
  private String company;
public Product() {}
public Product(String productid, String productname, double price, String company)
{
	super();
	this.productid = productid;
	this.productname = productname;
	this.price = price;
	this.company = company;
}
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
  
}
