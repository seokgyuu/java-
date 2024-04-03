package com.javaex.pratice3;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int a =sc.nextInt();
		
		
		for(int i=a; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.println("*");
			}
			System.out.println();
		
		}
		for(int i =2; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		}
	}