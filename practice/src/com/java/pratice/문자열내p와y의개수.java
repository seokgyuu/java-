package com.java.pratice;

public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		String s = "pPoooyY";
		int countp = 0;
		int county = 0;
		
		for(int i=0; i<s.length(); i++){
			char c = Character.toLowerCase(s.charAt(i));
			
			if(c == 'p') {
				countp ++;
			}
			if(c == 'y') {
				county++;
			}
		}	
		if(countp == county) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
}
}
