package com.java.pratice;

public class 조건에맞게수열변환 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,100,99,98};
		int answer[] = {arr.length};
		for(int i=1; i<answer.length; i++) {
			if(arr[i]<50 && arr[i] %2 != 0) {
				answer[i] = arr[i]*2;
			}else if(arr[i] >= 50 && arr[i] % 2 ==0) {
				answer[i] = arr[i]/2;
			}else {
				answer[i] = arr[i];
			}
			
		}
		for(int num : answer)
		System.out.println(num);
	}
}
