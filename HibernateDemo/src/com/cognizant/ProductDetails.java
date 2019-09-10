package com.cognizant;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductDetails {
	@Id
	private int productId;
	
	private String productName;
	private int brandId;
	private String brandName;
	private int price;
	private int quantity;
	private int discountedPrice;
	private String stockAvailability;
	public ProductDetails(int productId, String productName, int brandId, String brandName, int price, int quantity,
			int discountedPrice, String stockAvailability) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brandId = brandId;
		this.brandName = brandName;
		this.price = price;
		this.quantity = quantity;
		this.discountedPrice = discountedPrice;
		this.stockAvailability = stockAvailability;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public String getStockAvailability() {
		return stockAvailability;
	}
	public void setStockAvailability(String stockAvailability) {
		this.stockAvailability = stockAvailability;
	}
	
	
	

}
