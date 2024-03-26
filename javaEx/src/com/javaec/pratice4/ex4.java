package com.javaec.pratice4;

public class ex4 {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int result = 0;
		int count[] = new int[a.length];
		int count3 = 0;
		
		for(int i =0; i < a.length; i++) {
			if( a[i] % 3 ==0) {
				count[i] = a[i];
				count3++;
				result += a[i];
				
			}
		}
		System.out.println(count3);
		System.out.println(result);
		
		
	}
	
}
