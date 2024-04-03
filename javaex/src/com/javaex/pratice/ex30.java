package com.javaex.pratice;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		double a = 1.609;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("마일을 입력하세요:");
		int b = scanner.nextInt();
		
		double result = a *b;
		
		System.out.println(b + "마일은" + result +"킬로미터 입니다.");
		
		
		
	}

}
