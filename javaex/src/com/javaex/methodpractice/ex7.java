package com.javaex.methodpractice;

public class ex7 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		getLargeNumber(a,b);
	}
	private static void getLargeNumber(int a, int b) {
		if( a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
	}
}
