package com.javaex.basic.comditional;

import java.util.Scanner;

public class IfElse3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력:");
		int a = scanner.nextInt();
		
		if(a == 0) {
			System.out.println("0");
		}
		else {
			if(a > 0) {
				System.out.println("양수 입니다");
				}
				if(a%2 !=0) {
					System.out.println("홀수 입니다");
				}
				if(a%2 ==0) {
					System.out.println("짝수 입니다");
		
		}		else {
					System.out.println("음수입니다");
		}
			
				scanner.close();
		}
	}
}
