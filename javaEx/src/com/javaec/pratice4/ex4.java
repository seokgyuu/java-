package com.javaec.pratice4;

public class ex4 {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int result = 0;
		
		for(int i =0; i < a.length; i++) {
			if( a[i] % 3 ==0) {
				result = result + a[i];
				
			}
		}
		System.out.println(result);
		
	}
	
}
