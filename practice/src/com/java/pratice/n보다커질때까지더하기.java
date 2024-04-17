package com.java.pratice;

public class n보다커질때까지더하기 {

	public static void main(String[] args) {

		int numbers[] = {34,5,71,29,100,34};
		int n =123;
		int result =0; 
		
		for(int i=0; i < numbers.length; i++) {
		if(result < n ) {
			result += numbers[i];
		}else {
			System.out.println(result);
			
		}
		}
		
		
	}

}
