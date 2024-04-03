package com.java.pratice;

public class 나머지가1이되는수찾기 {

	
	public static void main(String[] args) {
		int n = 10;
		solution(n);
		
	}
	public static void solution(int n) {
		for(int x=1; x <n; x++) {
		if(n % x ==1) {
			System.out.println(x);
		}
		}
		}
	}

