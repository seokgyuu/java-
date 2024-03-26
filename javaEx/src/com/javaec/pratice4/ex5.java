package com.javaec.pratice4;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		int sc[] = {10,20,30,40,50};
		int avg = 0 , sum =0;
		for(int i =0; i<sc.length; i++) {
			sum += sc[i];
		}
		avg = sum/(sc.length);
		
		System.out.println("평균"+ avg);
				
		
		
				
	}

}
