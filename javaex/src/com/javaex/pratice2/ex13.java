package com.javaex.pratice2;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자:");
		int a = sc.nextInt();
		System.out.println("두번째 숫자:");
		int b = sc.nextInt();
		
		if(b % a == 0 ) {
			System.out.println(a + "는 " +b+"의 약수 입니다" );
			
		}else if
		(a % b == 0 ) {
			System.out.println(b + "는 " + a + "의 약수 입니다");
		}else {
			System.out.println(a + "는 " +b+"의 약수가 아닙니다");
		}
		sc.close();
	}

}
