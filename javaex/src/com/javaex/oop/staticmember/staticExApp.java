package com.javaex.oop.staticmember;

public class staticExApp {
	
	public static void main(String[] args) {
		staticEx s1 = new staticEx();
		System.out.println("refcount"+s1.refcount);
		
		staticEx s2 = new staticEx();
		System.out.println("refcount:"+staticEx.refcount);
		
		staticEx s3 = new staticEx();
		System.out.println("refcount:"+staticEx.refcount);
	
		s3 = null;
		System.out.println("s3 해제");
		System.out.println("refcount"+ staticEx.refcount);
		
		System.gc();
	}

}
