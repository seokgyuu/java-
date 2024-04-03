package com.javaec.exception;

public class ArrayException {

	public static void main(String[] args) {
		int[] intArray = new int[] {3,6,9};

		
	try {	
		System.out.println(intArray[3]);
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.err.println("error:"+e.getMessage());
	}finally {
		System.out.println("예외처리 종료");
	}
		
	}

}
