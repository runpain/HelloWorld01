package cn.zucc.day04;

public class Dog extends Pet {
	private String strain ;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	void print(){
		super.print();
		System.out.println("Ʒ����" +strain);
	}
	public Dog(String name, int health, int love) {
		super(name, health, love);
	}
	public Dog() {
		super();
	};
	

	
	
}
