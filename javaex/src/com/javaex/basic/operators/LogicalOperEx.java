package com.javaex.basic.operators;

public class LogicalOperEx {

	public static void main(String[] args) {
		int a = 7;
		int b;
		b =3;
		
		System.out.println(a>b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		int c= 5;
		
		boolean r1 = c>0;
		boolean r2 = c<10;
		boolean result = r1 && r2;
		
		System.out.println(result);
		
		r1 = c<=0;
		r2 = c>=10;
		result = r1 || r2;
		System.out.println(result);
		
		result = !(c>0 && c<10);
		System.out.println(result);
		
		result = !(c <=0 || c>=10);
	}

}
