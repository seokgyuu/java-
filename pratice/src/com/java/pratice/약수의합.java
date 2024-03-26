package com.java.pratice;

public class 약수의합 {

	public static void main(String[] args) {
		int n =12;
		solution(n);
	}
	public static void solution(int n) {
		int result = 0;
		for(int x=1; x<=n; x++) {
			if(n % x ==0 ) {
				result += x;
			}
		}
		System.out.println(result);
	}
}
