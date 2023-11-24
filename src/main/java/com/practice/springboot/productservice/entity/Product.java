package com.practice.springboot.productservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String productName;
	private int price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(long id, String productName, int price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public Product() {

	}

}
