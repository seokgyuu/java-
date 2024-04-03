package com.javaex.api.objectclass;

public class toString {
	String name;
	int age;
	
	public toString(String name , int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("이름:%s,나이:%d세", this.name , this.age);
	}
}
