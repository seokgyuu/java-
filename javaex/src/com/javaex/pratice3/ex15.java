package com.javaex.pratice3;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a =sc.nextInt();
		
		if(a ==0 && a==1) {
			System.out.println("다시 입력하세요");
			sc.close();
		}
		for(int i=1; i<=a; i++) {
			if(a%i ==0) {
				System.out.println(i);
			}
			
		}
	}

}
