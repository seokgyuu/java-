package com.java.pratice;

public class 원소들의곱과합 {

	
	public static void main(String[] args) {

		int a[] = {3,4,5,2,1};
		
		int sum = 0;
		int sum1 = 1;
		int sum2 =1;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			sum1 *= a[i];
			sum2 = sum*sum;
		}
		
		System.out.println(sum2);
		System.out.println(sum1);
		
		if(sum2 > sum1) {
			System.out.println(1);
		}else
			System.out.println(0);
	}
		
	

}
