package com.catdabang;

public class Dessert extends Menu{
	public int stock;
	public String expirydate;
	public Dessert(String name, int price, int stock, String expirydate) {
		super(name, price);
		this.stock = stock;
		this.expirydate = expirydate;
	}

}
