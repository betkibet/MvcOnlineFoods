package com.clc.model;

public class FoodModel {
	
	private String uservname;
	private String order_type;
	private int price;
	public FoodModel(String uservname, String order_type, int price) {
		super();
		this.uservname = uservname;
		this.order_type = order_type;
		this.price = price;
	}
	public String getUservname() {
		return uservname;
	}
	public void setUservname(String uservname) {
		this.uservname = uservname;
	}
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
