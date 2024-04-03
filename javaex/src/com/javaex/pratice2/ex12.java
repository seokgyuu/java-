package com.javaex.pratice2;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.println("숫자 1");
		int a = sc.nextInt();
		System.out.println("숫자 2");
		int b = sc.nextInt();
		System.out.println("숫자 3");
		int c = sc.nextInt();
		
		if( a > b && b > c) {
			System.out.println("가장 작은 수는" + c + "입니다");
			
		}else if(b> a && c > a) {
			System.out.println("가장 작은 수는" + a + "입니다");
		}else if(a> b && c> b) {
			System.out.println("가장 작은 수는" + b + "입니다");
		}else {
			System.out.println("세수는 같습니다");
		}
		sc.close();
	}

}
