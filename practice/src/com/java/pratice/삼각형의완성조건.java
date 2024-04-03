package com.java.pratice;

public class 삼각형의완성조건 {

	public static int sides[] = {1,2,3};
	
	public static void main(String[] args) {
		
		int max = sides[0];
		int middle = sides[0];
		int sh = sides[0];
		
		
		for(int i=1; i<sides.length; i++) {
			max = sides[i];
			
			}if(max < (middle + sh)) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
				
			}
		}
	

		
