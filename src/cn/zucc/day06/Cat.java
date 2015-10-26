package cn.zucc.day06;


public class Cat extends Animal implements Terrestrial{
	
	private int legNum;

	public Cat(String name, int legNum){
		super(name);
		this.legNum = legNum;
	}
	
	public void show(){
		System.out.print(getName()+"\t" + legNum+"\t");
	}
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("ίχίχίχ...");
	}

	@Override
	public int getLegNum() {
		// TODO Auto-generated method stub
		return legNum;
	}
	@Override
	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}

}
