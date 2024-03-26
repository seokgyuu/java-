package com.java.pratice;

public class 이어붙인수 {

	public final static int a[] = {3,4,5,2,1};
	
	public static void main(String[] args) {

		int sum = 0;
		int sum1 =0;
		
		for(int b : a ) {
			if(b % 2 ==0) {
				sum += b;
			}
			if(b % 2 !=0) {
				sum1 += b;
			}
		}
		System.out.println("짝수"+sum);
		System.out.println("홀수"+sum1);
		System.out.println("합계"+ (sum + sum1));
			
	}

}
