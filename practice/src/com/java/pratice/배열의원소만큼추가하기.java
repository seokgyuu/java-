package com.java.pratice;

import java.util.ArrayList;
import java.util.List;

public class 배열의원소만큼추가하기 {

	public static void main(String[] args) {

		int arr[] = {};
		List<Integer> result = new ArrayList<>(); 
		
		for(int num : arr) {
			for(int i=0; i < num; i++) {
				result.add(num);
			}
		}
		int[] answer = new int[result.size()];
		for(int i =0; i<result.size(); i++) {
			answer[i] = result.get(i);
		}
		System.out.println(answer);
	}

}
