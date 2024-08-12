package com.app.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CartItemDTO {
	
	
	@NotNull
	private String name;
	@Min(1)
	private int quantity;
	@Min(1)
	private double price;
	
	@NotNull
	private String userName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public CartItemDTO() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}
