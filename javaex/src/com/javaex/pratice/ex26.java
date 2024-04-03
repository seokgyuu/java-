package com.javaex.pratice;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("월급을 입력하세요");
		int a = scanner.nextInt();
		
		int result = a * 120;
		
		System.out.println("10년동안 최대 저축액은" + result + "입니다");
		}

}
