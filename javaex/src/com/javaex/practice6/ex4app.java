package com.javaex.practice6;

import com.javaex.practice6.ex4.Customer;
import com.javaex.practice6.ex4.Customer.Employee;

public class ex4app {

	public static void main(String[] args) {
		
		ex4[] exArray = new ex4[3];
		exArray[0] = new ex4("jws", "j1234", "정우성");
        exArray[1] = new Customer("jws", "j1234", "정우성", 1000);
        exArray[2] = new Employee("master", "m7788", "운영자", 50000);
        
        for(ex4 ex : exArray) {
        	ex.showinfo();
        if (ex instanceof Employee ) {
        	Employee e =(Employee) ex;
        	System.out.println(e.getName()+"의 월급은"+(e.getSalary()+"입니다"));
        }
        }
	}

}