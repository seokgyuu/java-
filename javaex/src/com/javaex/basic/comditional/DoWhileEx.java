package com.javaex.basic.comditional;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		int a = 0 , num;
		Scanner scanner = new Scanner(System.in);

		do {
		System.out.println("정수를 입력하세요 0이면 종료");
		num = scanner.nextInt();	
		a += num;
		
		}while(num != 0);
		
		scanner.close();
	}

}
