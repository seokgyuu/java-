package com.javaex.basic.comditional;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int a = scanner.nextInt();
		
		if( a> 60) {
			
			System.out.println("합격");
		
		}
		else if( a < 60) {
			
			System.out.println("불합");
			
		}
		else
			 return ;
	}

}
