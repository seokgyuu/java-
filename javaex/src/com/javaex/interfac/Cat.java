package com.javaex.interfac;

public class Cat implements Animal{
	
	@Override
	public void move() {
		System.out.println("사뿐사뿐");
	}
	
	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	

}
