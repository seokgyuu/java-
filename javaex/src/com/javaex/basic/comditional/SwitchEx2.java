package com.javaex.basic.comditional;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int a = scanner.nextInt();
		
		if(a % 3==0) {
			System.out.println("3의 배수입니다");
		}else
			System.out.println("3의 배수가 아닙니다");
	}

}
