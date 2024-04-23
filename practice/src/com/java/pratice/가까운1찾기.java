package com.java.pratice;

public class 가까운1찾기 {

	public static void main(String[] args) {
		
		int arr[] = {0,0,0,1 };
		int idx =1;
		int result =0;
		
		for(int i=1; i<arr.length; i++) {
			if(i >= idx && arr[i]==1) {
				result = i;
			}else {
				result =-1;
			}
			
		}
		System.out.println(result);
	}

}
