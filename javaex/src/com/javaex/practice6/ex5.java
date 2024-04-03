package com.javaex.practice6;

public class ex5 {
	private String name;
	private int salary;	
	private String where;
	
	public ex5(String name, int salary , String where) {
		this.name = name;
		this.salary =salary;
		this.where = where;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	
	public void getInformation() {
		System.out.println("이름"+getName()+"연봉:"+getSalary()+"부서"+getWhere());
	}
}
