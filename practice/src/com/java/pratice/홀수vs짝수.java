package com.java.pratice;

public class 홀수vs짝수 {

	public static void main(String[] args) {

		int num[] = {4,2,6,1,7,6};
		
		int result =0;
		for(int i =0; i < num.length; i+=2) {
			result += num[i];
			
		}
		System.out.println(result);
		int result1=0;
		for(int j=1; j<num.length; j+=2) {
			result1 += num[j];
			
		}
		System.out.println(result1);
		if(result > result1 ) {
			System.out.println(result);
	}else {
		System.out.println(result1);
	}
	
		}

}
