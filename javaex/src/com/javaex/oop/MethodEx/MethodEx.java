package com.javaex.oop.MethodEx;

public class MethodEx {

	public static void main(String[] args) {
		//매개변수 x 리턴 x
//		printMessage();
//		String message = getMessage();
//		System.out.println(message);
//		printDevice(4,0);
		int num1 =4 , num2 =4;
		double sum = getSum(num1,num2);
		System.out.println(sum);
	}
	
	private static double getSum(double num1 , double num2) {
	
		System.out.println("매개변수 있고ㅡ 리턴도 있는 매서드");
		return num1 + num2;
	}
	
//	private static double getSum(double num1, double num2, double num3) {
//		System.out.println("매개변수 없고, 리턴도 없는 매서드");
//	return num1 + num2 +num3;
//	}
	
	private static void printDevice(int num1 , int num2) {
		System.out.println("매개변수 있고 출력이 없는 매서드");
		if(num2 ==0) {
			System.out.println("0으로는 나눌 수 없습니다");
			return;
		}
		System.out.printf("%d/ %d = %d%n",num1,num2, num1/num2);
	}
	
	private static String getMessage() {
		return "매개변수 없지만 리턴은 있는 매서드";
		
	}
	private static void printMessage() {
		// 매개변수 x
		// 리턴 x ->
		System.out.println("매개변수 없고, 리턴도 없는 매서드");
	}
	
}
