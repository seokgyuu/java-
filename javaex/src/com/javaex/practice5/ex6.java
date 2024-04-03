package com.javaex.practice5;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		double a = 1338.60;
		dollar (a);
	}
	private static void dollar(double a) {
		Scanner sc =new Scanner(System.in);
		System.out.println("금액 입력:");
		int won = sc.nextInt();
		
		double result = won * a;
		
		System.out.println(won+"원은"+result+"달러입니다");
		
		
		
		
	}

}
