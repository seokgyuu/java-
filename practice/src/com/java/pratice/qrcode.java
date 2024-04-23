package com.java.pratice;

public class qrcode {

	public static void main(String[] args) {

		int q = 3;
		int r = 1;
		StringBuilder result = new StringBuilder();
		
		String code = "qjnwezgrpirldywt";
		
		for(int i=0; i<code.length(); i++) {
			if(i % q ==r) {
				result.append(code.charAt(i));
			}
		}
		System.out.println(result.toString());
		
	}

}
