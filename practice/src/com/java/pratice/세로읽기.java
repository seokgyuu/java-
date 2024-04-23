package com.java.pratice;

public class 세로읽기 {

	public static void main(String[] args) {

		String my_String = "ihrhbakrfpndopljhygc";
		int m =4;
		int c =2;
		String result ="";
	
		for(int i=c-1; i<my_String.length(); i+=m) {
			result += my_String.charAt(i);
		}
		System.out.println(result);
		
	}
}
