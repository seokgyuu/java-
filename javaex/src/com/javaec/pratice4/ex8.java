package com.javaec.pratice4;

import java.util.Random;

public class ex8 {

	public static void main(String[] args) {

		for(int i=0; i<=5; i++) {
			int a; 
			Random rd = new Random();
			a = rd.nextInt(45)+1;
			System.out.println(a);
		}
	}

}
