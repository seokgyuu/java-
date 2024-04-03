package com.javaex.practice5;

public class ex1 {

	public static void main(String[] args) {

		String a ="정우성";
		String c= "유재석";
		String e= "이효리";
		
		int b = 50000;
		int d = 30000;
		int f = 40000;
		
		jws(a,b);
		yjs(c,d);
		lhr(e,f);
		
	}
	public static void jws(String a , int b) {
		System.out.println("회원정보:"+a +b+"점");
		
	}
	public static void yjs(String c , int d) {
		System.out.println("회원정보:"+c +d+"점");
	
	}
	
	public static void lhr(String e , int f) {	
		System.out.println("회원정보:"+e +f+"점");
		
		
	}
}
