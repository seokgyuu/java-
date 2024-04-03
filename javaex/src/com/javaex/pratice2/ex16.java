package com.javaex.pratice2;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 \n숫자:");
		int a = sc.nextInt();
		
		double result1 = ((double)a*a*a) - (9*a) +2 ;
		double result2 = 7*a +2;
		
		if( a<=0 ) {
			System.out.println("계산 결과는" + result1 + "입니다");
		}else {
			System.out.println("계산 결과는" + result2 + "입니다");
		}
		sc.close();
	}

}
