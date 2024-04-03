package com.javaex.practice6;

public class ex6 {
	
	public void Service(String day) {
		switch (day) {
		case "낮":
			System.out.println("낮에는 열심히 수업듣자");
			break;
		case "밤":
			System.out.println("밤에는 숙면");
			break;
		case "오후":
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다");
			break;
		default:
			System.out.println("시간을 잘못 입력하셨습니다");
		}
		
	}

}
