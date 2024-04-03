package com.javaex.practice6;

public class ex2 {
	private String fillcolor;
	private String linecolor;
	
	public ex2() {
		System.out.println("생성자 ex(0)실행");
	}
	public ex2(String fillcolor, String linecolor) {
		this.fillcolor =fillcolor;
		this.linecolor =linecolor;
		System.out.println("생성자 ex(2)실행");
	}
	
}
