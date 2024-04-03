package com.javaex.practice6;

import com.javaex.practice6.ex1.Customer;

public class ex1app {

	public static void main(String[] args) {
		ex1 e = new ex1("정우성","010-1111-2222");
		e.showinfo();
		
		Customer c = new Customer("유재석","010-4249-2491", 1, 1000);
		c.showinfo();
	}

}
