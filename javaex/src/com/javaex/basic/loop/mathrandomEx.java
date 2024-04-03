package com.javaex.basic.loop;


public class mathrandomEx {

	public static void main(String[] args) {
		number();		
	}
	public static void number() {
		for(int i=1; i<=5; i++) {
			System.out.println((int)((Math.random() * 100) + 1));
		}
	}
}
