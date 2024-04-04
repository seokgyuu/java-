package com.java.pratice;

import java.util.Scanner;

public class 홀짝구분하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입려하세요");
		int n = sc.nextInt(); 
		
		if(n % 2 == 0 ) {
			System.out.println("is even");
		}else {
			System.out.println("odd");
		}
		
	}

}
