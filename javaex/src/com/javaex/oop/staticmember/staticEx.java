package com.javaex.oop.staticmember;

public class staticEx {
	public static int refcount;
	public static String classVar;
	public String instanceVar;
	
	static {
		refcount = 0;
		classVar = "static member";
		System.out.println("클래스 영역 초기화");
	}
	
	public staticEx() {
		
		refcount++;
		System.out.println("refcount,"+refcount);
		System.out.println("instance 생성");
	}
	
	//소멸자
	@Override
	protected void finalize() throws Throwable {
		refcount --;
		// 객체가 소멸될 때 참조 카운트를 줄임
		super.finalize();
		System.out.println("소멸자 호출");
	}

}
