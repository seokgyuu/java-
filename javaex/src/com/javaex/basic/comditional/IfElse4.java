package com.javaex.basic.comditional;

import java.util.Scanner;

public class IfElse4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 입력:");
		int a = scanner.nextInt();
	
			if(a ==1 ){
				System.out.println("R101");
			}
			if(a ==2) {
				System.out.println("R202");
			}
			if(a==3) {
				System.out.println("R303");
			}
			if(a==4) {
				System.out.println("R404");
			}else {
				System.out.println("상담원에게 문의하세요");
			}
			
			
		scanner.close();
		
	}
		
	
	}

