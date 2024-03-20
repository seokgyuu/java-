package com.javaex.pratice2;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해주세요");
		int a = sc.nextInt();
		
		double result1 = a*0.09;
		double result2 = 1000*0.09 + 0.18 * (a - 1000);
		double result3 = 1000*0.09 + 3000*0.18 + 0.27*(a-4000);
		double result4 = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(a-8000);
		
		if( 0 <= a && a <= 1000) {
			System.out.println("소득세는"+result1 +"입니다");
		}else if(1000 < a && a <=4000) {
			System.out.println("소득세는"+result2 +"입니다");
		}else if(4000 < a && a < 8000) {
			System.out.println("소득세는"+result3 +"입니다");
		}else if( a >= 8000){
			System.out.println("소득세는"+result4 +"입니다");
		}else {
			System.out.println("잘 못 입력했습니다");
		}
		sc.close();
	}

}
