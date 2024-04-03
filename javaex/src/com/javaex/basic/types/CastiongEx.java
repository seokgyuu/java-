package com.javaex.basic.types;

public class CastiongEx {

	public static void main(String[] args) {
		
		promotionEx();
		castingEx();
	}
	public static void castingEx() {
		
		double d = 1234567.890;
		System.out.println(d);
		
		float f = (float)d;
		System.out.println(f);
		
		long l = (long)f;
		System.out.println(l);
		
		short s =(short)l;                                                                                       
		System.out.println(s);
	}
	
	public static void promotionEx() {
		
		byte b= 25; 
		System.out.println(b);

		short s =b;
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
		
		long l = i;
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		
		char ch = 'A';
		short s2 = (short)ch;
		System.out.println(s2);
	}

}
