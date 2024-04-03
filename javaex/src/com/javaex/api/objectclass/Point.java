package com.javaex.api.objectclass;

//모든 객체의 최상 객체는 Object
//object 클래스는 객체가 개체로서의 기능을 수행하기 위한 기본적인 기능들을 구현
public class Point { // extends.java.langObject
	
	private int x;
	private int y;
	
	//생성자 
	public Point (int x , int y) {
		this.x= x;
		this.y = y;
	}
	
	//to String : 객체 정보를 문자열로 출력할 때 호출되는 메서드
	
	@Override
	public String toString() {
		return "Point("+x+","+y+")";
	}

}
