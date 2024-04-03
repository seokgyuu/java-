package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {

		String str1;
		str1 = "java";
		String str2 ="java";
		String str3 = new String("java");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str2);
	
	}

}
