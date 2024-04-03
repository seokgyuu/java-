package com.java.practice2;

public class Goods {

	private String name;
	private int price;
	

		
	
	public void setname(String name) {
		this.name = name;
}
	public String getname() {
		return name;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public int price() {
		return price;
	}
	public void showinfo() {
		System.out.println("상품"+name);
		System.out.println("가격"+price);
	}
}