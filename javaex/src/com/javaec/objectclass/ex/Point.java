package com.javaec.objectclass.ex;

// 객체의 복제
// 얇은 복제 : 필드의 값만 동일하게 복제한것(프리미티브 타입일 경우)
public class Point implements Cloneable{ // extends.java.langObject
	//object 가진 clone() 매세더를 사용하려면
	//clonealbe 인터페이스를 구현해야 한다.
	
	private int x;
	private int y;
	//생성자 
	public Point (int x , int y) {
		this.x= x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
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
	public Point getClone() {
		//새로 생성될 Point 객체
		Point clone = null;
		
		//복제시도
		//clone 메서드 반환 타입은 Object
		try {
		clone = (Point)clone();
		}catch(CloneNotSupportedException e) {
			//clone이 불가능한 상황에 대한 예외처리
		}
		return clone;
		}

}
