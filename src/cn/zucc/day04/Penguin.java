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
		System.out.println("�Ա�Ϊ" + sex);
	}

	public Penguin(String name, int health, int love) {
		super(name, health, love);
	};
	public Penguin() {
		super();
	*/
	public void cure(){

		System.out.println("���Ա��ˣ�����ֵ����3");
	}
	  public void print() {
			
	  }
	  public void swim(){
		  System.out.println("ȥ��Ӿ������콡��ֵ����10�����������ܶ�����5��");
	  }
}
