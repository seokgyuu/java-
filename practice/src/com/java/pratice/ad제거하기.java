package com.java.pratice;

import java.util.Arrays;

public class ad제거하기 {

	public static void main(String[] args) {
		String[] strArr = {"and","notad","abcd"};

		String[] answer = new String[strArr.length];
		
		for(int i =0; i<strArr.length; i++) {
			answer[i] = strArr[i].replaceAll("ad","");
		}
		System.out.println(Arrays.toString(answer));
	}

}
