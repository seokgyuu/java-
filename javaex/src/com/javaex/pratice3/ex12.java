package com.javaex.pratice3;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int a = sc.nextInt();
	 
			if(a ==0 && a==1) {
				sc.close();
			
			
			}int result =1;
			for(int i = 2; i<=a; i++) {
				result *=i;
			}
			
			System.out.println(result);
		
	}
		
	}

