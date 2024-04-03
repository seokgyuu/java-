package com.javaex.api.objectclass2;

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
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			//전달 받은 파라미터 obj가 point인지 확인
			//object -> point로 캐스팅
			Point other = (Point)obj;
			//두 객체의 동등성
			//두 객체의 x필드가 같고, 두객체의 y필드가 같아야 동등하다
			//return x == other.x && y == other.y;

			if(x == other.x &&  y == other.y) {
				return true;
			}else {
				return false;
			}
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return "Point("+x+","+y+")";
			
	}

}
