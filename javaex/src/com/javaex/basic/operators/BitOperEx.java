package com.javaex.basic.operators;

public class BitOperEx {

	public static void main(String[] args) {

		bitOperTest();
		bitshiftTest();
		
	}
	
	public static void bitshiftTest() {
		int val =1;
		System.out.println(val);
		
		System.out.println(Integer.toBinaryString(val <<1 ));
		System.out.println(Integer.toBinaryString(val <<4 ));
		
		int val2 = 0b1000;
		System.out.println(Integer.toBinaryString(val2));
		
		System.out.println(Integer.toBinaryString (val2 >> 1));
		System.out.println(Integer.toBinaryString (val2 >> 3));
	}

	public static void bitOperTest() {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2;
		System.out.println
			(Integer.toBinaryString(result));
		
		result = b1 | b2;
		System.out.println
			(Integer.toBinaryString(result));
		
		result = b1 ^ b2;
		System.out.println
			(Integer.toBinaryString(result));
		
		result =  ~b1; 
		System.out.println
			(Integer.toBinaryString(result));
		System.out.println(result);
		
	}
}
