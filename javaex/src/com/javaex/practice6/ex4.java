package com.javaex.practice6;

public class ex4 {
	private String id;
	private String pw;
	private String name;

	

	public ex4(String id ,String pw ,String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void showinfo() {
		System.out.println("아이디"+id+"비밀번호"+pw+"이름"+name);
	}
	
	public static class Customer extends ex4{
 	
		private int point;
	
	public Customer(String id , String pw , String name , int point) {
		super(id,pw,name);
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public void showinfo() {
		System.out.println("아이디"+super.getId()+"비밀번호"+super.getPw()+"이름"+super.getName()+"포인트점수"+getPoint());
	}
	public static class Employee extends ex4{ 
		private int salary;
		

		public Employee(String id,String pw, String name , int salary) {
			super(id,pw,name);
			this.salary = salary;
		}
		public int getSalary() {
			return salary;
		}
		
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
	@Override
	public void showinfo() {
		System.out.println("아이디"+super.getId()+"비밀번호"+super.getPw()+"이름"+super.getName()+"월급"+getSalary());
	
	}
		
	}
	
	}
}