package com.javaex.pratice2;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)룰 입력해주세요\n사번:");
		int a = sc.nextInt();
		
		if( a  == 0){
			
			System.out.println("A팀입니다");
	}else if( a % 3 == 0 ){
		System.out.println("A팀 입니다");
		
	}else if( a % 3 == 1) {
		System.out.println("B팀 입니다");
	}else if( a % 3 == 2) {
		System.out.println("c팀 입니다");
	}else {
		System.out.println("잘못 입력하셨습니다");
	}
		sc.close();
	
	}

}
