package com.javaex.arrayex;

public class arrayex2 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		int num = arr.length;
		
		for(int i =0; i <arr.length; i++) {
			arr[i] =num;
			num --;
		}
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
