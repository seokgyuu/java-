package com.java.practice2;

public class xy {
	
	private int x;
	private int y;
	

	public void Point(int x, int y) {
		this.x = x;
		this.y = y;
		
		
	}
	public void setx(int x) {
		this.x = x;
		
	}
	public int getx() {
		return x;
		
	}
	public void sety(int y) {
		this.y=y;
	}
	public int gety() {
		return y;
	}
	public void draw() {
		System.out.println("점"+x+","+y+"를 그렸습니다");
		
	}
}
