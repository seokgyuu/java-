package com.javaex.basic.comditional;

import java.util.Scanner;

public class Switchex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int a = scanner.nextInt();
		String message ="";
		
		if (a >=90) {
			message = "a";
		}else if(a>= 80) {
			message = "b";
			
		}else if (a >=70) {
			message = "c";
		}else if (a >=60) {
			message = "d";
		}else {
			message = "f";
		}
		scanner.close();
	}
}
