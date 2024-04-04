package com.java.pratice;

public class 등차수열의특정한항만더하기 {


	public static void main(String[] args) {
			
		int a = 3;
		int b = 4;
		boolean included[] = {true , false , false , true , true};
		int answer = 0;
		
		
		for(int i =0; i < included.length; i++) {
			if(included[i]) {
				answer += a;
			}
			a+=b;
		}
		System.out.println(answer);
			
			
			
		}
		
		
	}

