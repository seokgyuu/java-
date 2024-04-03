package com.java.pratice;

public class 휴대폰번호가리기 {

	public static void main(String[] args) {
		String answer = "";
		int phone_number[] = {};
		
		for (int i = 0; i<phone_number.length; i++) {
			if(i < phone_number.length -4)
				answer += "*";
			
		else 
			answer += phone_number.length;

		}
		System.out.println(answer);
	}
}
