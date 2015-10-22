package cn.zucc.day04;

public class Penguin extends Pet{
	private String sex;

	

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	void print(){
		super.print();
		System.out.println("ÐÔ±ðÎª" + sex);
	}

	public Penguin(String name, int health, int love) {
		super(name, health, love);
	};
	public Penguin() {
		super();	
	};
}
