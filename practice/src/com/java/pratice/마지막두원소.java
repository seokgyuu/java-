package com.java.pratice;

public class 마지막두원소 {

	public static void main(String[] args) {
		int num_list[] = {2,1,6};
		int last = num_list.length -1;
		int secondlist = last-1;
		
		if(num_list[last] > num_list[secondlist]) {
			System.out.println(num_list[last] -  num_list[secondlist]);
		}else {
			System.out.println( num_list[secondlist]*2);
		}
		
		}

}
