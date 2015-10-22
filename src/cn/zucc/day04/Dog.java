package cn.zucc.day04;

public  class Dog extends Pet {
	/*private String strain ;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	void print(){
		super.print();
		System.out.println("品种是" +strain);
	}
	public Dog(String name, int health, int love) {
		super(name, health, love);
	}
	public Dog() {
		super();
	};*/
	
	public void cure(){
		System.out.println("狗狗吃饱了，健康值增加3");
	}
	  public void print() {
		}
	public void play(){
		System.out.println("去玩飞盘,狗狗健康值减少10，与主人亲密度增加5。");
	}
	
}
