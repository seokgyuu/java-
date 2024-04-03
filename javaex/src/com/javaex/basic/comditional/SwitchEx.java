package com.javaex.basic.comditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목 번호를 입력하세요");
		int a = scanner.nextInt();
		
		switch(a) {
		case 1 :
		 	System.out.println("r1o1입니다");
		 	break;
		case 2:
			System.out.println("r202입니다");
			break;
		case 3:
			System.out.println("r303입니다");
			break;
		case 4:
			System.out.println("r404입니다");
			break;
		default:
			System.out.println("관리자에게 문의하세요");
			break;
		}
		scanner.close();
	}

}
