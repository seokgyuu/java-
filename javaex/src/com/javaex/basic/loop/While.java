package com.javaex.basic.loop;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan = scanner.nextInt();
		
		int  i = 1;
		int result = dan * i;
		
		while(dan <= 9)
		{
			while(i <= 9) {
				System.out.println(dan + "x" + i + "=" +result);
				i++;

			}
		}
	}

}
