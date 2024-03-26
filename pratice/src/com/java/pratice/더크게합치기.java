package com.java.pratice;

public class 더크게합치기 {

	public final static int a = 9;
	public final static int b = 89;
	
	
	public static void main(String[] args) {

		
		String ab = String.valueOf(a) + String.valueOf(b);
		String ba = String.valueOf(b) + String.valueOf(a);
		
		int abvalue = Integer.parseInt(ab);
		int bavalue = Integer.parseInt(ba);
		
		if (abvalue >= bavalue) {
			System.out.println(abvalue);
		}else {
			System.out.println(bavalue);
		}
		
		
		
	}
		
	}
		
		
	
