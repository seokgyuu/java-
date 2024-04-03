package com.javaex.pratice;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("화씨:");
		int a = scanner.nextInt();
		
		double b = ((double)5/9) * (a -32);
		
		System.out.println("화씨" + a + "의 섭씨 온도는 " + b + "입니다");
	}

}
