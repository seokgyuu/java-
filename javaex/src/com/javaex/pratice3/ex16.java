package com.javaex.pratice3;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int a = sc.nextInt();
	
		int count =0;
		int result =0;
		
		for(int i=1; i<=a; i++) {
			if(i%5 == 0) {
				count++;
				result +=i;
			
			}
			
		}
		System.out.println("5의 배수 개수:"+count+"5의배수의 합:"+result);
	
		sc.close();
	}

}
