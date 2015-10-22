package cn.zucc.day04;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店");
		System.out.println("请输入要领养宠物的名字：");
		String na = input.next();
		System.out.println("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
		int num = input.nextInt();
		if (num==2) {
			Penguin pen = new Penguin(na,100,20);
			System.out.println("请选择企鹅的性别:(1、Q仔 2、Q妹)");
			String sex = input.next();
			pen.setSex(sex);
			System.out.println("企鹅的自白：");

			System.out.println("我的名字叫"+na+"我的健康值是"+100+"我和主人的亲密程度是"+20+"我的性别是"+sex);

		}
		if (num==1) {
			Dog dog = new Dog(na,100,20);
			System.out.println("请输入狗的品种：(1、大狗2、小狗)");
			int  str = input.nextInt();
			if(str==1){
			}
			System.out.println("狗狗的自白：");
			System.out.println("我的名字叫"+na+"我的健康值是"+100+"我和主人的亲密程度是"+20+"我的性别是"+str);

		}*/
		
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("请输入狗 的名字：");
		String name=sc.next();
		Dog dog = new Dog(name,100,20);
		System.out.println("请输入狗的品种：");
		String str = sc.next();
		dog.setStrain(str);
		dog.print();
		System.out.println("请输入企鹅 的名字：");
		String name1=sc.next();
		Penguin pen = new Penguin(name1,100,20);
		System.out.println("请输入企鹅的性别：");
		String sex = sc.next();
		pen.setSex(sex);
		pen.print();*/
		/*UsbImplements usbImplements=new UsbImplements();
		usbImplements.service();
		usbImplements.service3();
		
		Usb usb12 = new UsbImplements(); 
		usb12.service1();*/
	
		Pet pet = new Dog(){} ;
		Pet pet2 = new Penguin() {};
		
		 	Master master = new Master();
		 	master.Cure(pet);
		 	master.Play(pet);
		 	master.Cure(pet2);
		 	master.Play(pet2);	}
}
