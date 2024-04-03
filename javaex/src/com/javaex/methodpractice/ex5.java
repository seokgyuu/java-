package com.javaex.methodpractice;

public class ex5 {

	public static void main(String[] args) {

		printOddOrEven();
	}
	private static void printOddOrEven() {
		for(int i =0; i<= 100; i++) {
			if(i % 2 ==0 ) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}
	}

}
