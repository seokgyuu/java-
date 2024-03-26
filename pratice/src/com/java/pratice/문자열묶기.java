package com.java.pratice;

public class 문자열묶기 {

	
	public static void main(String[] args) {

		String[] str = {"ge"};
		int[] count = new int[10000];
		
		for(int i = 0; i<str.length; i++) {
			int length = str[i].length();
			count[length]++;
		}
		System.out.println(count);
		
	
		
		
		
	}
}
