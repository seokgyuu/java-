package com.java.practice2;

import java.util.Scanner;

public class friendapp {

	public static void main(String[] args) {

		friend[] friends = new friend[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			
			friend f = new friend();
	
			System.out.println((i+1));
			String name =sc.next();
			f.setName(name);
	
			System.out.println((i+1));
			String hp = sc.next();
			f.setHp(hp);
			
			
			System.out.println((i+1));
			String school = sc.next();
			f.setSchool(school);
	
			friends[i] = f;

		}
		
		System.out.println("입력한 친구정보");
		for(friend f : friends) {
		f.showinfo();
		}
		sc.close();

}
}