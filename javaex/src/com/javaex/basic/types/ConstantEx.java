package com.javaex.basic.types;

public class ConstantEx {

	public static void main(String[] args) {
		
		final double PI = 3.13159;
		final int SPEED_LIMIT = 100;
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);

	
		System.out.println("현재 재한 속도는 " + SPEED_LIMIT + "입니다");
		System.out.println("제한속도 " + SPEED_LIMIT + "이하로 주행해 주세요");
	}

}
