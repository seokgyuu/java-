package com.java.pratice;

import java.util.Scanner;

public class 가습기 {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("auto , target , minimum 모드를 설정하세요:");
		int val_set = 45;
		String mode = sc.next();
		
		if(mode.equals("auto")) {
			System.out.println("습도를 입력하세요");
			int humidity = sc.nextInt();
		if(humidity >= 50) {
			System.out.println(0);
		}else if(humidity>=40 && humidity <50) {
			System.out.println(1);
		}else if(humidity>=30 && humidity <40) {
			System.out.println(2);
		}else if(humidity >=20 && humidity <30) {
			System.out.println(3);
		}else if(humidity >=10 && humidity <20) {
			System.out.println(4);
		}else {
			System.out.println(5);
		}
		sc.close();
	
		}
		if(mode.equals("target")) {
			int humidity =sc.nextInt();
			System.out.println("습도를 입력하세요");
		if(val_set > humidity) {	
			System.out.println(3);
		}else {
			System.out.println(1);
		}
		sc.close();
		}
		if(mode.equals("minimum")){
			int humidity = sc.nextInt();
			System.out.println("습도를 입력하세요");
		if(val_set > humidity) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
		}
}
}