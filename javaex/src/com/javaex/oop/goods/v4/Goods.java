package com.javaex.oop.goods.v4;

public class Goods {
	
	private String name;
	private int price;
	
	public Goods(String name) {
		this.name = name;
		System.out.println("name 초기화");
	}
	
	public Goods(String name , int price) {
		this.price = price;
		System.out.println("전체 빌드 초기화 생성자");
	}
	
	public String getName() {
		return name;
	}

}
