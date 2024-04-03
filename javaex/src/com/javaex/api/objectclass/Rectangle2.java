package com.javaex.api.objectclass;

public class Rectangle2 {

	private int width;
	private int height;

	
	public Rectangle2 (int width , int height) {
		this.width = width;
		this.height =height;
	}
	public int area() {
		return width * height;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
		}
		return super.equals(obj);
	}
}
