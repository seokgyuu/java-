package com.javaex.abstract1;

public abstract class Creature {

	abstract class Animal extends Creature{
		
	} 
	abstract class Fish extends Creature{
	}
	
	interface swimable{
		void swimming();
	}
	
	interface flyable{
		void flying();
	}
	
	interface talkable{
		void talking();
	}
	
	class parrot extends Animal implements flyable{
		@Override
		public void flying(){
			
		}
	
	}
	
	class Tiger extends Animal{
		
	}
	
	class People extends Animal implements swimable ,talkable{
		@Override
		public void swimming() {
			
		}
		@Override
		public void talking() {
			
		}
		
	}
	
	class whale extends Fish implements swimable{
		@Override
		public void swimming() {
			
		}
	}
	
	}
