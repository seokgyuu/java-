package com.javaex.override;

public class personapp {
	public static void main(String[] args) {

		person p = new person("정우성",45);
		p.showinfo();
		
		Student s1 = new Student("서울고등학교");
		s1.showinfo();
		
		Student s2 =new Student("이정재",45,"한국고등학교");
		s2.showinfo();
	}
}
