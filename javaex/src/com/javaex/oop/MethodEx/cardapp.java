package com.javaex.oop.MethodEx;

public class cardapp {

	public static void main(String[] args) {
		
		System.out.println(card.width);
		System.out.println(card.height);
		
		card c1 = new card();
		c1.kind = "spade";
		System.out.println(c1.kind);
		
	
		card c2 = new card();
		c2.kind = "heart";
		System.out.println(c2.kind);
	}

}
