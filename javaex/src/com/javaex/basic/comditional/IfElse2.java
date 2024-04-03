package com.javaex.basic.comditional;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자입력");
		int num = scanner.nextInt();
		
//		if(num >0) {
//			System.out.println("양수입니다");
//			
//		}
//		else if (num < 0) {
//			
//			System.out.println("음수 입니다");
//		}
//		else {
//			System.out.println("0입니다");
//			
//		}
		
		if(num ==0) {
			System.out.println("0");
			
		}else {
			if(num >0) {
				System.out.println("양수입니다");
				
			} else {
				System.out.println("음수 입니다");
			}
		}
		
		
		scanner.close();
	}

}
