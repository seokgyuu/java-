 package com.javaec.pratice4;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("금액:");
		int a = sc.nextInt();
		
		int ar[] = new int[10];
		ar[0] = 50000;
		ar[1] = 10000;
		ar[2] = 5000;
		ar[3] = 1000;
		ar[4] = 500;
		ar[5] = 100;
		ar[6] = 50;
		ar[7] = 10;
		ar[8] = 5;
		ar[9] = 1;		
		int count[] = new int[ar.length];
		
		
		for(int i=0; i < ar.length; i++) {
			count[i] =  a / ar[i];
			a %= ar[i];
			
		}
		for (int i =0; i<ar.length; i++) {
			System.out.println(ar[i] + "원" + count[i]);
		}
		sc.close();
	}

}
