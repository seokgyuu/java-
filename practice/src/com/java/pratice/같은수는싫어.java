package com.java.pratice;

import java.util.ArrayList;

public class 같은수는싫어 {

	public static void main(String[] args) {

	int arr[] = {1,1,3,3,0,1,1};
	solution(arr);
	
	}
	public static void solution(int arr[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int num : arr) {
			list.add(num);
		}
		
	}
	
}


