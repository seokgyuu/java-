package com.java.pratice;

public class 삼총사 {

	public static void main(String[] args) {
		int number[] = {-2,3,0,2,-5};
		int result =0;
		
		for(int i =0; i < number.length; i++) {
			for(int k =i+1; k < number.length; k++) {
				for(int j = k+1; j < number.length; j++) {
					if(number[i]+number[k]+number[j]==0) {
						result ++;
					}
				}
			}
		}
		System.out.println(result);
		
		
	}

}
