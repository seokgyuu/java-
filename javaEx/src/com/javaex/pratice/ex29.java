package com.javaex.pratice;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("너비를 입력하세요");
		double a = scanner.nextInt();

		Scanner scanner2 = new Scanner(System.in);
		System.out.println("높이를 입력하세요");
		double b = scanner.nextInt();
		
		double result = a*4;
		double result2 = a*b;
		
		System.out.println("사각형의 둘레는" + result + "입니다");
		System.out.println("사각형의 넓이는" + result2 + "입니다");
	}

}
