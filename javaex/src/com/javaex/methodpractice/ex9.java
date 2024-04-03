package com.javaex.methodpractice;

public class ex9 {

	public static void main(String[] args) {
		
		sumall(1,2,3,4);
	}
	private static void sumall(int ... number) {
		int result = 0;
		
		for(int num : number) {
			result += num;
		}
		System.out.println(result);
		
	}

}
