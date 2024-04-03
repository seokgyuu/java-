package com.java.practice2;

public class Point2 {

	private int x;
	private int y;
	
	
	public Point2() {
		this.x = 0;
		this.y = 0;
	}
	public Point2(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		Point2 point = new Point2();
		System.out.println(point.x + point.y);
		
		Point2 point1 = new Point2(3,4);
		System.out.println(point1.x + point1.y);
		
	}
}
