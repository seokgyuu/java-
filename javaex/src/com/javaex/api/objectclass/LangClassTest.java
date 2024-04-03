package com.javaex.api.objectclass;

public class LangClassTest {

	public static void main(String[] args) {
		
		Point p = new Point(10,10);
		
		// java의 최상위 클래스는 object다 -> 모든 기본 기능을 물려받음
		System.out.println(p.getClass().getName()); //클래스 이름 반환
		System.out.println(p.hashCode()); // hashcode > 객체 식별값
		System.out.println(p.toString()); // 객체 내용을 문자열로 출력 기능
		System.out.println(p);
	
		//p의 부모 객체 정보 확인
		System.out.println(p.getClass().getSuperclass());
		
		Point p2 = new Point(10,10);
		System.out.println(p2.hashCode());
	}

}

