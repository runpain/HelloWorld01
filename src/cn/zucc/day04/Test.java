package cn.zucc.day04;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		System.out.println("��ӭ�����������");
		System.out.println("������Ҫ������������֣�");
		String na = input.next();
		System.out.println("��ѡ��Ҫ�����ĳ������ͣ���1������ 2����죩");
		int num = input.nextInt();
		if (num==2) {
			Penguin pen = new Penguin(na,100,20);
			System.out.println("��ѡ�������Ա�:(1��Q�� 2��Q��)");
			String sex = input.next();
			pen.setSex(sex);
			System.out.println("�����԰ף�");

			System.out.println("�ҵ����ֽ�"+na+"�ҵĽ���ֵ��"+100+"�Һ����˵����̶ܳ���"+20+"�ҵ��Ա���"+sex);

		}
		if (num==1) {
			Dog dog = new Dog(na,100,20);
			System.out.println("�����빷��Ʒ�֣�(1����2��С��)");
			int  str = input.nextInt();
			if(str==1){
			}
			System.out.println("�������԰ף�");
			System.out.println("�ҵ����ֽ�"+na+"�ҵĽ���ֵ��"+100+"�Һ����˵����̶ܳ���"+20+"�ҵ��Ա���"+str);

		}*/
		
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("�����빷 �����֣�");
		String name=sc.next();
		Dog dog = new Dog(name,100,20);
		System.out.println("�����빷��Ʒ�֣�");
		String str = sc.next();
		dog.setStrain(str);
		dog.print();
		System.out.println("��������� �����֣�");
		String name1=sc.next();
		Penguin pen = new Penguin(name1,100,20);
		System.out.println("�����������Ա�");
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
