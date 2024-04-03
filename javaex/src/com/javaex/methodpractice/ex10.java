package com.javaex.methodpractice;

public class ex10 {

	public static void main(String[] args) {
		conString("굿");
		
	}
	private static void conString(String ... values) {
		String result = "";
		
		for(String val : values) {
			result += val;
		}
		System.out.println(result);
		
	}

}
