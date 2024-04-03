package com.javaec.api.arrays;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		// 1. 기본 타입 검색 
		basicSearch();
		
		// 2. 사용자 정의 객체의 검색
		
		
	}
	private static void basicSearch() {
		int[] nums = {6,4,3,5,7,9,8,2,1,10};
		
		// 이진 검색 방식의 배열은 정렬이 되어 있어야 한다.
		Arrays.sort(nums);
		System.out.println("정렬된 배열:" +Arrays.toString(nums));
		int index = Arrays.binarySearch(nums, 8); //뒤에 8은 검색 대상 배열
		
		System.out.println("8의 인덱스:"+index);
	}

}
