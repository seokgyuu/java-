package com.java.pratice;

import java.util.ArrayList;
import java.util.List;

public class 콜라츠수열 {

	public static void main(String[] args) {
		int n =10;
		List<Integer> list = new ArrayList<Integer>();
		list.add(n);
		while ( n != 1) {
			if(n % 2 == 0) {
				n /= 2;
				System.out.println(n);
			}
			else { 
				n = 3*n+1;
				System.out.println(n);
			}
		}
	}

}
