package com.java.practice2;

public class converter {

	public static double rate;
	
	public static void setRate(double rate) {
		converter.rate = rate;
	}
	public static double todollar(double won) {
		return won / rate;
		
	}
	public static double tokwr(double kwr) {
		return kwr * rate;
	}
}
