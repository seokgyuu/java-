package com.javaex.oop.staticmember;

public class singletonapp {

	public static void main(String[] args) {
		singleton s1 = singleton.getinstance();
		singleton s2 = singleton.getinstance();
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		System.out.println("s1 == s2 ? "+(s1 == s2 ));
	}

}
