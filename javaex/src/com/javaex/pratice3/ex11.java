package com.javaex.pratice3;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int a =sc.nextInt();
			
			int result = sum(a);
			
			if(a %2 ==1) {
				System.out.println(a+"까지 홀수의 합은" + result + "입니다");
				
				}else {
					System.out.println(a+"까지 짝수의 합은"+result +"입니다");
			}
			sc.close();
			
	}
	public static int sum(int n) {
		int total = 0;
		if(n % 2==1) {
			for(int i =1; i<=n; i+=2) {
				total +=i;
			}
			
		}else {
			for(int i = 2; i<=n; i+=2) {
				total += i;
			}
		}
		return total;
	}

}
