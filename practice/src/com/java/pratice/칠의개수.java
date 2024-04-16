package com.java.pratice;

import java.util.Arrays;

public class 칠의개수 {

	public static void main(String[] args) {
		int array[] = {};
		int answer =0;
		
		String str = Arrays.toString(array);
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i)=='7') {
				answer ++;
			}
		}
		System.out.println(answer);
		
		
	}

}
