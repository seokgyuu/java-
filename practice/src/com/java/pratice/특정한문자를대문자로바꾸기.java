package com.java.pratice;

public class 특정한문자를대문자로바꾸기 {

	public static void main(String[] args) {
		
		String my_String = "programmers";
		String alp = "P";
	
		String answer = my_String.replace(alp, alp.toUpperCase());
		System.out.println(answer);
	}
}
