package cn.zucc.day07;

public class Age {
	int age;
	public int setAge(){
		return age;	
	}
	public void setAge(int age) throws Exception{
		if(age >=1 && age <= 100){
			System.out.println("年龄为"+age);
		    }else {
		    	throw new Exception("年龄必须在1~100之间！") ;
				}	
			}
}
