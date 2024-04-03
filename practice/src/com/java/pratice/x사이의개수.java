package com.java.pratice;

import java.util.Arrays;

public class x사이의개수 {

	public static void main(String[] args) {
		String myString = "xabcxdefxghi";
		String[] words = myString.split("x");
		
		int[] answer = new int[words.length];
		
		for(int i =0; i<words.length; i++) 
		answer[i] = words[i].length();
		System.out.println(Arrays.toString(answer));
	}

}
