package com.javaex.methodpractice;


public class ex3 {

	public static void main(String[] args) {
		getRandomNumber();
	}
	public static void getRandomNumber() {
		int rd = (int)(Math.random()*100);
		System.out.println(rd);
	}

}
