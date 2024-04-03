package com.java.pratice;

public class 가채점 {

	
	public static void main(String[] args) {
		int numbers[] = {1};
		int our_score[] = {100};
		int score_list[] = {100,80,90,84,20};
		
		int student  = numbers.length;
		String[] answer = new String[student];
		
		for(int i=0; i< student; i++) {
			if(score_list[numbers[i]-1] == our_score[i]) {
				answer[i] = "same";
			}
			else {
				answer[i] = "different";
			}
			System.out.println(answer[i]);
			
		}
			
	}

}
