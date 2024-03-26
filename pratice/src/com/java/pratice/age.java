package com.java.pratice;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("태어난 연도를 입력하세요");
		int year =scanner.nextInt();
		
		System.out.println("나이의 종류를 선택하세요 (korea or year");
		String type =scanner.next();
		
		int age2030 = calculatorAge2030(year , type);
		
		System.out.println("2030" + type + "으로 계산한 나이" + age2030  + "살" );
	}

		public static int  calculatorAge2030(int year , String type) {
			
			int currentyear = 2030;
			
			if("korea".equalsIgnoreCase(type)) {
				
				return currentyear - year + 1;
				
				
			}
			
			else if("year".equalsIgnoreCase(type)) {
				
				return currentyear - year;
			}
			
			else 
				
				return 0;
			
			
			
		}
}
