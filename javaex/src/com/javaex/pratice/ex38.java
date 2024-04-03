package com.javaex.pratice;

import java.util.Scanner;

public class ex38 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("전체금액을 입력해주세요");
		int a = scanner.nextInt();
		
		int b = a%1000;
		int result = a-b;
		System.out.println("실제지불금액은:"+ result +"입니다");
	}

}
