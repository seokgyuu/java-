package com.javaex.practice6;

public class ex1 {
	private String name;
	private String hp;

	public ex1(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}
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
	public void showinfo() {
		System.out.println("이름"+name+"전화번호"+hp);
	}
	public static class Customer extends ex1{
		private int cNO;
		private int point;

		public Customer(String name, String hp ,int cNO, int point) {
			super(name, hp);
			this.cNO =cNO;
			this.point = point;
		}

		public int getcNO() {
			return cNO;
		}
		public void setcNO(int cNO) {
			this.cNO = cNO;
		}
		public int getPoint() {
			return point;
		}
		public void setPoint(int point) {
			this.point = point;
		}
		@Override
		public void showinfo() {
			System.out.println("이름"+super.getName()+"전화번호"+super.getHp()+"고객번호"+getcNO()+"포인트"+getPoint());
		}
	}
}
