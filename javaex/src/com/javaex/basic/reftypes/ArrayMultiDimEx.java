package com.javaex.basic.reftypes;

public class ArrayMultiDimEx {

	public static void main(String[] args) {

			int two [][] = new int[5][10];
			
			int[][] table = {
					{1,2,3,4,5,6,7,8,9,10},
					{2,3,4,5,6,7,8,9,10,1},
					{3,4,5,6,7,8,9,10,1,2},
					{4,5,6,7,8,9,10,1,2,3},
					{5,6,7,8,9,10,1,2,3,4}
					
			};
			System.out.println(table);
			System.out.println("table.length;" + table.length);
			System.out.println("table[0.length:" + table[0].length);
			
	}

	}

