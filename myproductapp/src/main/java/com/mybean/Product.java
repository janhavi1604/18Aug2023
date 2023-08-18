package com.mybean;

public class Product {
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, float price, int quantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	private String productName;
	private float price;
	private int quantity;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
