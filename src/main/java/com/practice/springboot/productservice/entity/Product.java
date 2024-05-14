package com.practice.springboot.productservice.entity;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String productName;
	private int price;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(String id, String productName, int price) {
		super();
		this.id = UUID.randomUUID().toString(); // Generating UUID
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
