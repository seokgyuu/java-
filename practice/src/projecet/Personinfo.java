package projecet;

public class Personinfo {
	private String name;
	private String hp;
	private int num ;
	
	public Personinfo(String name ,String hp , int num) {
		this.name = name;
		this.hp =hp;
		this.num = num;
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



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	@Override
	public String toString() {
		return "Personinfo [name=" + name + ", hp=" + hp + ", num=" + num + "]";
	}



	public void showinfo() {
		System.out.printf("%s","%s","%d",name,hp,num);
	}
	

	
}
