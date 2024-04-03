package com.javaex.practice6;

public class ex3_2 extends ex3 {
	private int width;
	private int height;
	
	public ex3_2(int width ,int heigth) {
		super(null,null);
		this.width = width;
		this.height =heigth;
				
	}
	public void showinfo() {
		System.out.println("삼각형");
		System.out.println("면색:"+fillcolor);
		System.out.println("선색:"+linecolor);
		System.out.println("가로:"+width);
		System.out.println("세로:"+height);
	}
	
	

}
