package com.javacalculator;

public class ex{
	String name;
	
	void setName(String name) {
		this.name = name;
		
	}
}
	
	class tiger extends ex{
		
	}
	
	class lion extends ex{
		
	}

	
	class zookeeper{
		void feed(tiger t) {
			System.out.println("feed apple");
		}
		void feed(lion l) {
			System.out.println("fedd banana");
		}
	

public static void main(String[] args) {
		zookeeper z = new zookeeper();
		tiger t = new tiger();
		lion l = new lion();
		z.feed(t);
		z.feed(l);
	}
}

