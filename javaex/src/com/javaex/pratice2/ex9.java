package com.javaex.pratice2;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요\n 년도:");
		int a = scanner.nextInt();
		
		int b = 2023;
		int result = b - a;
		
		if(result >= 65) {
			System.out.println(result + "살 무료예방접종 대상자 입니다");
		}else
			if(result >= 15) {
				System.out.println(result+"살 무료예방접종 대상자가 아닙니다");
			}else {
				System.out.println(result+"살 무료예방접종 대상자 입니다");
			}
		scanner.close();
	}
	}

