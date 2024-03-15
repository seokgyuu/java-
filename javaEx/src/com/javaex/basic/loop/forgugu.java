
package com.javaex.basic.loop;

import java.util.Scanner;

public class forgugu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan = sc.nextInt();
		
		int i = 1;
		int result = dan * i;
		
		for(i=1; i<=9; i++ ) {
			System.out.println(dan + "x" + i +" = " + result);
		}
			
	}

}
