package com.javaex.pratice2;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자:");
		int a = sc.nextInt();
		System.out.println("두번째 숫자:");
		int b = sc.nextInt();
		
		int  resulta = a/b;
		int  reuslta2 = a%b;
		int resultb = b/a;
		int resultb2 = b % a;
		
		if( a == b) {
			System.out.println("몫:1\n나머지:0");
			
		}else 
			if(a > b) {
				System.out.println("몫:"+resulta + "\n나머지:" + reuslta2);
				
			}else {
				System.out.println("몫:"+resultb + "\n나머지:" + resultb2);
			}
		sc.close();
	}

}
