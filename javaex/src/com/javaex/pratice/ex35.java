package com.javaex.pratice;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		
		int day = 365;
		int h = 24;
		int m = 60;
		int s = 60;
		int time = day * h * m * s;
		long speed = 300000;
		long result = time * speed;
		
		System.out.println("빛이 1년 동안 가는 거리는" + result + "입니다");
		
		
	}

}
