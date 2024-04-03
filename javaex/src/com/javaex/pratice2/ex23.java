package com.javaex.pratice2;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요\n년도:");
		int a =sc.nextInt();
		System.out.println("올헤:2023");
		System.out.println("태어난해:"+a);
		
		int result = 2023-a;
		System.out.println("나이:"+result);
		System.out.println("==============================");
		
		if(result < 20 ) {
			System.out.println("20살 미만 건강검진대상이 아님");
			
		}else
			if(result>=20 && result < 60 && result % 2 ==0) {
				System.out.println("20살이상\n건강검진해\n암 검사 x");
			}if(result >=40 && result%2==0) {
				System.out.println("20살이상\n건강검진해\n암 검사");
			}if(result >=20 && result%2 != 0) {
				System.out.println("20살이상\n건강검진해 아님");
			}else {
				sc.close();
			}
		
	
	}

}
