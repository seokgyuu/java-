package com.javaex.pratice2;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("기호:");
		String str = sc.next();
		System.out.println("숫자1:");
		int a = sc.nextInt();
		System.out.println("숫자2:");
		int b = sc.nextInt();
		
		double result1 = a + b;
		double result2 = a - b;
		double result3 = a * b;
		double result4 = a / b;
		
		if( a==0 && b==0) {
			System.out.println("계산 할 수 없습니다");
			
		}else if( str == "+") {
			System.out.println("결과는:"+result1);
		}else if( str == "-") {
			System.out.println("결과는:"+result2);
		}else if( str == "*") {
			System.out.println("결과는:"+result3);
		}else if( str == "/") {
			System.out.println("결과는:"+result4);
		}else {
			System.out.println("계산할 수 없는 기호 입니다");
		}
		sc.close();
	}

}
