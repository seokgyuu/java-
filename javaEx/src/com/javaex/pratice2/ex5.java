package com.javaex.pratice2;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이:");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
			
		}else {
			System.out.println("\"'2번그룹\'");
		}
		System.out.println("입니다");
		
		
	}
}
