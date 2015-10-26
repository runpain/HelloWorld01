package cn.zucc.day06;

public class Duck extends Animal implements Terrestrial {
	private int legNum;

	public Duck(String name, int legNum){
		super(name);
		this.legNum = legNum;
	}
	
	
	@Override
	public void shout() {
		System.out.println("¸Â¸Â¸Â...");
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
