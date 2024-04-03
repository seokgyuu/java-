package com.javaex.pratice;

import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("전체 연필갯수를 입력하세요:");
		int a = scanner.nextInt();

		System.out.println("전체 인원수를 입력하세요:");
		int b = scanner.nextInt();
		
		int result1 = a / b;
		int result2 = a % b;
	
		System.out.println("1인당 연필의 갯수는" + result1 + "입니다");
		System.out.println("연필의 나머지 갯수는" + result2 + "입니다");
	}

}
