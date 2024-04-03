package com.javaex.pratice3;

import java.util.Scanner;

public class ex19 {
	private static int bank = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
			System.out.println("1.예금");
			System.out.println("2.출금");
			System.out.println("3.잔고");
			System.out.println("4.종료");
			a= sc.nextInt();
			
			switch (a) {
			case 1:
				plus(sc);
				break;
			
			case 2:
				m(sc);
				break;
			
			case 3:
				result(sc);
				break;
				
			case 4:
				System.out.println("시스템을 종료합니다");
				break;
				
			default:
				System.out.println("다시 입력하세요");
			}
			}while( a != 4);
		
		sc.close();
	}


	public static void plus(Scanner sc) {
		System.out.println("예금할 금액을 입력하세요");
		int add = sc.nextInt();
		bank += add;
		System.out.println(add+"원을 예금하였습니다");
		
	}
	public static void m(Scanner sc) {
		System.out.println("출금할 금액을 입력하세요");
		int count = sc.nextInt();
		if(bank >= count) {
			bank -= count;
			System.out.println(count+"원을 출금하였습니다");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
			
		}
		public static void result(Scanner sc) {
			System.out.println("현재 잔고는"+bank+"원 입니다");
	}

}
