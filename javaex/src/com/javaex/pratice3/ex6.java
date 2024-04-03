package com.javaex.pratice3;

public class ex6 {

	public static void main(String[] args) {
		int c =0;
		
		for(int num =0; num <100; num++) {
			if(num%5 !=0 && num%7 != 0 ) 
				continue;
			c++;
			System.out.println(num);
		}
	}

}
