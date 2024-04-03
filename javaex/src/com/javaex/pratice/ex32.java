package com.javaex.pratice;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로:");
		int a = scanner.nextInt();
		
		System.out.println("세로:");
		int b = scanner.nextInt();
		
		int result = a * b;
		
		System.out.println("삼각형의 넓이는" + result + "입니다");
	}

}
