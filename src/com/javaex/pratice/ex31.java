package com.javaex.pratice;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품가격:");
		int a = scanner.nextInt();
		
		System.out.println("받은돈:");
		int b = scanner.nextInt();
		
		double c = a/10;
		double d = b -a ;
		
		if(a > b) {
			System.out.println("결제 금액이 부족합니다");
		
		}
		
		else {
		
		System.out.println("=================");
		
		System.out.println("받은돈:" + b);
		System.out.println("상품가격" + a);
		System.out.println("부가세:" + c);
		System.out.println("잔액:" + d);
		}
		}

}
