package com.javaex.pratice2;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요/n사번:");
		int a =sc.nextInt();
		
		if( a % 3 ==0) {
			System.out.println("a팀");
		}else
			if(a % 3 == 1) {
				System.out.println("b팀");
			}
		if(a % 3 == 2) {
			System.out.println("c팀");
		}
		else {
			System.out.println("잘못된 사번입니다");
		}
		sc.close();
	}

}
