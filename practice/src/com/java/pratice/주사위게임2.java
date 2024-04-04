package com.java.pratice;

import java.util.Scanner;

public class 주사위게임2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a:");
		int a = sc.nextInt();
		System.out.println("b:");
		int b = sc.nextInt();
		System.out.println("c:");
		int c =sc.nextInt();
		
		int result = 0;
		
		
		if(a != b && b != c && a != c) {
			result = a + b + c;
			System.out.println(result);
			
		}else
			if(a == b && b == c){
				result = (a+b+c)*((a*a)+(b*b)+(c*c)*((a*a*a)+(b*b*b)+(c*c*c)));
				System.out.println(result);
				
			}
			else {
				result = (a+b+c)*((a*a)+(b*b)+(c*c));
				System.out.println(result);
			}
		sc.close();
		
	}

}

