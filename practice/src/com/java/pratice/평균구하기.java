package com.java.pratice;

public class 평균구하기 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		int result =0;
		double aver = 0;
		for(int i =0; i<arr.length; i++){
			result += arr[i];
			aver = result/4;
			
			System.out.println("result="+result);	
			System.out.println("aver="+aver);
	}
	}
}
