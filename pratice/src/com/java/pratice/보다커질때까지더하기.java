package com.java.pratice;

public class 보다커질때까지더하기 {

	public final static int numbers[] = {34,5,71,29,100,34};
	
	public static void main(String[] args) {
		int n =123;
		int result = 0;
		
		for(int i =0; i< numbers.length; i++) {
			if(result + numbers[i] >n) {
				break;
			}else {
				
				result += numbers[i];
			}
			
		}
		System.out.println(result);
		
		
		
	}

}
