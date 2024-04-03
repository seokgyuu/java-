package com.javaex.pratice3;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a =sc.nextInt();

		for(int n=1; n<=a; n++) {
			for(int j=1; j<=n; j++)
			System.out.println(n);
			}
		System.out.println();
	}

}
