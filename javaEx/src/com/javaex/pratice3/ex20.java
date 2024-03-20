package com.javaex.pratice3;

import java.util.Random;
import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rd = (int) ((Math.random() * 100) + 1);
		int a;
		
		System.out.println("=========================");
		System.out.println("    [숫자 맞추기게임 시작]    ");
		System.out.println("==========================");
		
		a = sc.nextInt();
		
			
		while( rd > 0 && rd <=100) {
		
		if(a > rd) {
			System.out.println("더 낮게");
			a = sc.nextInt();
			continue;
		}if(a < rd) {
			System.out.println("더 높게");
			a = sc.nextInt();
			continue;
		}
		if( a == rd ) {
			System.out.println("정답입니다\n게임을 종료 하시겠습니까?(y/n)");
			String str = sc.next();
				if( str == "y") {
					System.out.println("=======================");
					System.out.println("     [숫자 맞추기게임 종료]");
					System.out.println("=======================");
				}else {
					System.out.println("다시");
					sc.close();
				}

		
		}
		
	}

}}