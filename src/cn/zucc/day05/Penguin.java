package cn.zucc.day05;

public class Penguin {
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Penguin(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public Penguin() {
		super();
	}
	@Override
	public String toString() {
		return "名字为" +name + "\t性别为" + sex;
	}
	
	

}
