package com.javaex.basic.operators;

public class ArithOperEx {

	public static void main(String[] args) {
		//산술연산
		arithOperTest();
		incrOperTest();
		assignOperTest();
	
		
		
	}
	
	public static void assignOperTest() {
		
		int a = 7;
		int b = 3;
		
		a = a + b;
		System.out.println(a);
		a +=b;
		System.out.println(a);
		
		
		
		
	}
	
	public static void incrOperTest() {
		int a = 10;
		int b ;
		
		System.out.println(a);
		b = ++a; 
		System.out.println(b);
		System.out.println(a);
		
		a = 10; 
		System.out.println(a);
		b = a++;
		System.out.println(b);
		System.out.println(a);
		
	}
	
	public static void arithOperTest() {
	
		int a = 7;
		int b = 3;
		
		System.out.println(-a);
		System.out.println("-----------------");

	
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	
		System.out.println(a / b);
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b);
	}

}
