package com.javaex.basic.loop;

public class BreakEx {

	public static void main(String[] args) {

		int num =1;
		
		while(true) {
			if(num % 6 ==0 && num %14 ==0) {
				break;
			}
			num += 1;
					
		}
		System.out.println(num);
	}

}
