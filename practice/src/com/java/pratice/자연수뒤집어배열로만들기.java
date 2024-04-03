package com.java.pratice;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		int n = 12345;
		solution(n);
		
	}
	public static void solution(int n) {
		int[] a = new int[String.valueOf(n).length()];
		
		for(int i = 0; i<a.length; i++) {
			a[i] = n%10;
			n /= 10;
		}
		for(int value : a ) {
			System.out.println(value + "");
		}
	}

}
