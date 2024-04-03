package com.java.practice2;

public class friend {
	private String name;
	private String hp;
	private String school;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	
	}
		
	public void showinfo() {
		System.out.println(name + hp + school);
	}


}
