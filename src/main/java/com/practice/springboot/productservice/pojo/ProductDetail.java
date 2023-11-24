package com.practice.springboot.productservice.pojo;

public class ProductDetail {

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

	public ProductDetail(long id, String productName, int price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	public ProductDetail(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public ProductDetail() {
		super();
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}

}
