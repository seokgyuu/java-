 package com.java.pratice;

import java.util.ArrayList;

public class 배열만들기1 {

	public static final int n = 10;
	public static final int k = 3;
	
	public static void main(String[] args) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i =1;  i<= n; i++) {
			if(i % k == 0) {
				result.add(i);

			}
			
		}
		System.out.println(result);
		

	}
	
	
}
