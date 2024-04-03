package com.java.pratice;

public class 문자열겹쳐쓰기 {

	public static void main(String[] args) {
		String my = "He11oWor1d";
		String write = "lloWorl";
		solution(my,write);
		
	}
	public static void solution(String my , String write) {
		String re = my.replaceAll("[11-1]", write);
		System.out.println(re);
		
	}
}
