package com.javaex.oop.MethodEx;

public class tvapp {

	public static void main(String[] args) {

		tv t1 = new tv();
		tv t2 = new tv();
		System.out.println(t1.channel);
		System.out.println(t2.channel);

		t1.channel = 8;
		System.out.println("t1 채널의 값을 8로 변경했습니다");
		
		System.out.println(t1.channel);
		
	}

}
