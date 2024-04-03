package com.javaex.methodpractice;

public class ex4 {

	public static void main(String[] args) {
		getSum();
	}
	private static void getSum() {
		int result = 0;
		for(int i =1; i<= 10; i++) {
			result += i;
		}
		System.out.println(result);
	}
}
