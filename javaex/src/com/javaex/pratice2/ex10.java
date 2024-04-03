package com.javaex.pratice2;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if( a == b ) {
			
			System.out.println("큰수:"+a + "작은수:" + b + "입니다");
			
		}else 
			if( a > b) {
				System.out.println("큰수:"+a + "작은수:" + b + "입니다");
			}else {
				System.out.println("큰수:"+ b + "작은수:" + a + "입니다");
			}
		scanner.close();
	}

}
