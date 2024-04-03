package com.javaex.api.objectclass;

public class Main {

	public static void main(String[] args) {

		Point2 p1 =new Point2(1,3);
		Point2 p2 =(Point2)p1.clone();
		System.out.println(p1.toString());
		System.out.println("p1 hashCode" + p1.hashCode());
		System.out.println(p2.toString());
		System.out.println("p2hashCode" + p2.hashCode());
	}

}
