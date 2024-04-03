package com.javaex.pratice2;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키와 뭄무게를 입력해 주십시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		double BMI = b/(double)a*a;
		
		if(18.5 <= BMI && BMI <= 24.9) {
			System.out.println("정상체중");
			
		}else
			if(BMI < 18.5) {
				System.out.println("저체중입니다");
			}if(BMI > 24.9) {
				System.out.println("과체중입니다");
			}
			System.out.println("BMI:"+BMI);
			
			scanner.close();
	}

}
