package com.javaex.oop.point.v4;

public	class car2 {
	
	private String modelname;
	private String color;
	private int year;
	private int maxspeed;
	private int currentspeed;
	
	car2(String modelname , String color , int year , int maxspeed , int currentspeed){
		this.modelname = modelname;
		this.color = color;
		this.year = year;
		this.maxspeed = maxspeed;
		this.currentspeed = 0;
		
	}
	public String getmodel() {
		return this.year + "년식" + this.modelname + "" +this.color;
	}
}
