package com.java.pratice;

import java.util.Scanner;

public class 공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number값 입력:");
		int number = sc.nextInt();
		System.out.println("n값 입력:");
		int n = sc.nextInt();		
		System.out.println("m값 입력:");
		int m =sc.nextInt();
		
		if(number % n ==0 && number % m ==0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		sc.close();
		
		
	}

}
