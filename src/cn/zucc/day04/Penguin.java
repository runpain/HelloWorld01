package cn.zucc.day04;

public  class Penguin extends Pet{
	private String sex;

	
   public Penguin(){
	   
   }
 
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	/*void print(){
		super.print();
		System.out.println("性别为" + sex);
	}

	public Penguin(String name, int health, int love) {
		super(name, health, love);
	};
	public Penguin() {
		super();
	*/
	public void cure(){

		System.out.println("企鹅吃饱了，健康值增加3");
	}
	  public void print() {
			
	  }
	  public void swim(){
		  System.out.println("去游泳啦，企鹅健康值减少10，与主人亲密度增加5。");
	  }
}
