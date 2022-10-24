package com.catdabang;

public class Drink extends Menu{
	public String extra;
	public Drink(String name, int price, String extra) {
		super(name, price);
		this.extra=extra;
		
	}
}
