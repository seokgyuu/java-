package com.java.pratice;

public class 일로만들기 {

	public static void main(String[] args) {
		int num_list[] = {12,4,15,1,14};
		int answer= 0;
		
		for(int num : num_list) {
			int count =0;
			while(num !=1) {
				if(num % 2 ==0) {
					num /= 2;
				}else {
					num = (num -1) /2;
				}
				count ++;
			}
			answer += count;
		}
		System.out.println(answer);
	}

}
