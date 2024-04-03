package com.javaec.api.stringclass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {

		//문자열 기본
		stringBasic();
		usefunMethods();
		//문자열 다양한 메서드
		
	}
	private static void stringBasic() {
		String s1 = "java";
		String s2 = new String("java");
		String s3 ="java";
		
		//리터럴과 new 객체 생성이 다르게 작동
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		//리터럴의 경우 , 데이터가 같으면 같은 객체로 취급
		
		//배열을이용한 String 생성자
		char[] letters = {'j','a','v','a'};
		String s4 = new String(letters);
		System.out.println(letters);
		
		String s5 = String.valueOf(2024);
		System.out.println(s5);
		
	}
	private static void usefunMethods() {
		String str = "java programming , oop programming";
		
		System.out.println("str"+str);
		
		//문자열 길이 확인 : .length()
		System.out.println(".length"+str.length());
		//인덱스 범위 : 0 ~.length() -1
		
		// 변환 메서드
		System.out.println("toUpperCase" + str.toUpperCase());
		//전부 대문자로 변환 toUpperCase
		System.out.println("toLowerCase:" + str.toLowerCase());
		
		//검색
		System.out.println("charAt:" + str.charAt(5)); //5번 인덱스의 글자
		int index = 0;
		index = str.indexOf("programming");//str내 programming의 위치 인덱스
		
		System.out.println("1st search:" + index);
		index += "programming".length(); //검색 시작 위치를 뒤로 이동
		index = str.indexOf("programming",index); // 새로운 시작 위치에서 검색
		System.out.println("2nd search:" +index);
		index += "programming.".length(); // 검색 시작 위치를 뒤로 이동
		index = str.indexOf("programming",index);  // 새로운 시작 위치에서 검색
		System.out.println("3rd search" + index); //검색할 것이 없으면 -1
		// indexof로 검색시 찾는것이 없으면 -1
		
		index =str.lastIndexOf("programming"); // 검색을 뒤에서부터 찾기
		System.out.println("lastIndexof:"+index);
	
		System.out.println("str"+str);
		//부분 문자열 추출 : subString
		System.out.println("subString:"+ str.substring(5));//끝까지
		System.out.println("subString" + str.substring(5,16));
		//5 ~ 16 -1 까지
		
		//치환: Replace , ReplaceAll
		System.out.println("replace:"+str.replace("programming","coding"));
		
		System.out.println(str);
		
		String str2 = "           Hello     ";
		// Whitespcae(공백,개행,탭문자) 지우기
		System.out.println(str2);
		String str4 = str2.trim(); //화이트 스페이스 지우기
		System.out.println(str4);
		System.out.println(str2.replaceAll(" " ,""));
		
		//원본 출력
		System.out.println("원본"+str);
		//문자열 데이터는 불변이다
		//여러가지 메서드를 통해 변화가 발생 했더라도 원본은 유지된다
		
		//구분자로 분리 :split()
		String[] split = str.split("");
		//공백문자를 기준으로 문자열을 분리 -> 문자열 배열로 변환
		System.out.println(Arrays.toString(split));
		
		for(String data : split ) {
			System.out.println("조각:" + data);
			
		}
		
		// 문자열 비교 메서드 : compareTo
		// 문자열 Unicode 비교
		// 같으면 0 , 작으면 음수 (-1) , 그면 양수 (1)
		System.out.println("abc".compareTo("abd"));
		
		
	}
	
	
}
