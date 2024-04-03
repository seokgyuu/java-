package com.javaex.oop.staticmember;

public class singleton {
	private static singleton instance =
			new singleton();
	private singleton(){
		
	}
	public static singleton getinstance() {
		return instance;
	}
}
