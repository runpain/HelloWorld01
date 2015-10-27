package cn.zucc.day06;

public class Dolphin extends Animal{

	public Dolphin(String name){
		super(name);
	}
	
	@Override
	public void shout() {
		System.out.println("∫£Î‡“Ù...");
	}
	public void show(){
		System.out.print(getName() + "\t0\t");
	}

}