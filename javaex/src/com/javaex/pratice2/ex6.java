package com.javaex.pratice2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		int a = scanner.nextInt();
		
		if(a>=19 && a < 65) {
			System.out.println("1번그룹");
		}else {
			System.out.println("2번그룹");
		}
			scanner.close();
	}

}
