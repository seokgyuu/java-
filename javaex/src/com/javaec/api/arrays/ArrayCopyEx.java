package com.javaec.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		char[] src = "java programming".toCharArray();
		System.out.println(src);
		System.out.println(Arrays.toString(src));
		
		char target[] = new char[src.length];
		System.arraycopy(src,0,target,0,src.length);
		
		System.out.println(target);
		System.out.println(Arrays.toString(target));
		
		//arrays.copyOf을 이용한 
		target = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(target));
		
		//Arrays.copyRangeOf :범위 복제
		target = Arrays.copyOfRange(src, 5, 7);
		
		System.out.println(Arrays.toString(target));
	}

}
