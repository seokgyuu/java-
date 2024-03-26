package com.javaex.practice5;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름");
		String a = sc.next();
		System.out.println("핸드폰");
		String b = sc.next();
		System.out.println("학교");
		String c = sc.next();
		friend(a,b,c);
	}
	public static void friend(String a , String b ,String c ) {
		
		System.out.println("이름:"+a);
		System.out.println("핸드폰:"+b);
		System.out.println("학교:"+c);
		
		System.out.println("이름:"+a+"핸드폰"+b+"학교"+c);
		
	}

}
