package com.javaex.methodpractice;

public class ex8 {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		concatenateStrings(a,b);
	}
	private static void concatenateStrings(String a, String b) {
		String result = a.concat(b);
		System.out.println(result);
		
	}

}
