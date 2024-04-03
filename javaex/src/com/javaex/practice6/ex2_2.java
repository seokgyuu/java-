package com.javaex.practice6;

public class ex2_2 extends ex2{
	private int width;
	private int height;
	
	public ex2_2() {
		super();
		System.out.println("생성자 ex2_2(0)실행");
	}
	public ex2_2(int width,int height) {
		super("검정","검정");
		this.width = width;
		this.height =height;
		System.out.println("생성자 ex2_2(2)실행");
	}
	public ex2_2(String fillColor, String lineColor, int width, int height) {
        super(fillColor, lineColor); 
        this.width = width;
        this.height = height;
        System.out.println("생성자 ex2_2(4) 실행");
	}
}
  