package com.javaex.basic.operators;

public class CondOperEx {

	public static void main(String[] args) {

		int a = 10;
		
		String result = a % 2 == 0 ? "짝수" : "홀수"; 
		System.out.println(a + "는" + result + "입니다");
		
		int score = 70;
		String message;
		
		if(score > 80) {
			System.out.println("good");
		}
		else if(score > 50) {
			System.out.println("pass");	
		}	
		else 
			System.out.println("fail");
	}

}
