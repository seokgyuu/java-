package com.javaex.basic.loop;

public class continueEx {

	public static void main(String[] args) {

		int i = 0;
		
		for(i=1; i<=20; i++) {
			System.out.println(i);{
				if(i % 2 ==0 && i % 3 == 0)
					continue;
					System.out.println(i);
			}
			
		}
	}

}
