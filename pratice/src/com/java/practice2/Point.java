package com.java.practice2;

public class Point {
	private int x;
	private int y;

	public void  setx(int x) {
		this.x = x;
		
	}
	public int getx() {
		return x;
	}
	public void sety(int y) {
		this.y = y;
	}
	public int gety() {
		return y;
	}
	public void showinfo() {
		System.out.println("Point p="+x+","+y);
		
	}
	class ColorPoint extends Point{
		private String color;
	}
}
