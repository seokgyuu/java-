package com.javaex.override;

class person {

	private String name;
	private int age;

	
	public person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showinfo() {
		System.out.println("name"+name+"age"+age);
	}
}
class Student extends person{
	private String school;
	
	public Student(String school) {
		super("" , 0);
		this.school = school;
	}
	public Student(String name , int age , String school) {
		super(name,age);
		this.school =school;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public void showinfo() {
		System.out.println("name"+super.getName()+"age"+super.getAge()+"학교"+school);
	}
}