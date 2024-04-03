package com.javaex.pratice2;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int a = scanner.nextInt();
		
		if(a>= 20) {
			System.out.println("성인 / 5000원입니다.");
			
		}else
			if(a >= 8 && a <=13) {
			System.out.println("초등학생 /2000원입니다");
		}if(a>=14 && a<=16) {
			System.out.println("중학생/3000원입니다");
		}if(a>=17 && a<=19) {
			System.out.println("고등학생 /4000원입니다");
		}if(a >=  0 && a <= 7) {
			System.out.println("취학전아동/무료입니다");
		}
		scanner.close();
	}

}
