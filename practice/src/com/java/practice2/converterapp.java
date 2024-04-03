package com.java.practice2;

public class converterapp {

	public static void main(String[] args) {
		
		double dollar;
		double won;
		
		converter.setRate(1341.30);
		
		dollar = converter.todollar(1000000);
		System.out.println(dollar);
		won = converter.tokwr(100);
		System.out.println(won);
		
	}

}
