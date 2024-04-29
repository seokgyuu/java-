package com.java.pratice;

import java.util.Scanner;

public class 피타고라스의정리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("a값을 입력하세요:");
		int a = sc.nextInt();
		System.out.println("b값을 입력하세요:");
		int b = sc.nextInt();
		
		int c = (a*a) + (b*b);
		
		System.out.println(c);
		
	}

}
