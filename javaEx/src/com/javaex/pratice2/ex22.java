package com.javaex.pratice2;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요\n숫자1:");
		int a = sc.nextInt();
		System.out.println("숫자2:");
		int b = sc.nextInt();
		System.out.println("숫자3:");
		int c = sc.nextInt();
		
		if(a==b && b==c){
			System.out.println("같습니다");
			
			
		}else
			if(a > b && b>c) {
				System.out.println("가장큰수는"+a+"입니다");
			}if(b>a && a>c) {
				System.out.println("가장큰수는"+b+"입니다");
			}if(c>b && b>a) {
				System.out.println("가장큰수는"+c+"입니다");
			}
			else
				System.out.println("잘 못 입력했습니다");
		
		}
		
}
