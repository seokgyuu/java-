package com.javaex.pratice;

import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner( System.in);
		System.out.println("500원 개수:");
		int a = scanner.nextInt();
		
		System.out.println("100원 개수:");
		int b = scanner.nextInt();
		
		System.out.println("50원 개수:");
		int c = scanner.nextInt();
		
		System.out.println("10원 개수:");
		int d = scanner.nextInt();
		
		int a1 = a*500;
		int b1 = b*100;
		int c1 = c*50;
		int d1 = d*10;
		
		int result = a1+b1+c1+d1;
		
		System.out.println("동전의 총합은 " + result + "입니다");
	}

}
