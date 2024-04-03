package com.javaex.api.objectclass;

public class Point2 {
	
	private int x;
	private int y;
	
	public Point2(int x , int y) {
		this.x = x;
		this.y = y;
		
	}
	@Override
	public String toString() {
		return "x=" + x + ",y=" + y;
	}
	@Override
	public Point2 clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return(Point2) obj;
	}
}
