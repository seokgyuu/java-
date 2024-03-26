package com.java.pratice;

import java.util.Scanner;

public class ageout {

	public static void main(String[] args) {
		
		int year = 2022;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int a = scanner.nextInt();
		
		int result = year -a +1;
		
		System.out.println("태어난 연도는" + result + "입니다");
		
		
	}

}
