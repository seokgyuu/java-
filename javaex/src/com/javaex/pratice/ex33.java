package com.javaex.pratice;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름:");
		int a = scanner.nextInt();
		
		double b = ((double)4/3)*3.14*a*a*a;
		
		System.out.println("구의 부피는" + b +  " 입니다.");
		
		
	}

}
