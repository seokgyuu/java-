package com.java.pratice;

public class 원하는문자열찾기 {

	public static void main(String[] args) {

		String myString = "AbCdEfG";
		String pat = "aBc";
		
		String lowerMyString = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();
		
		if(lowerMyString.contains(lowerMyString)) {
			System.out.println(1);
		}else{
			System.out.println(2);
		}
	}
	
	

}
