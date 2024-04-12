package com.java.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class 카운트업 {
	
	
	public static void main(String[] args) {
		int start= 3; 
		int end= 10;
		int result[] = new int[(end - start) +1];
		
		for(int i =0; i<= end -start; i++) {
			result[i] = i+start;
		}
		System.out.println(Arrays.toString(result));
		
		
	
	
	}
	
	

}
