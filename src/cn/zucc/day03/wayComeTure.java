package cn.zucc.day03;

import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class wayComeTure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Test mytest = new Test(); String myFruit = "ƻ��"; String myJuice =
		 * mytest.test(myFruit); System.out.println(myJuice); Test st = new
		 * Test(); Scanner input = new Scanner(System.in); for (int i = 0; i <
		 * 5; i++) { System.out.println("������ѧ��������"); String newName=
		 * input.next(); st.addname(newName); } st.showNames();
		 */
		Scanner input = new Scanner(System.in);
		/*String flag;
		
		 * Test cm = new Test(); do { System.out.print("������ͻ�������:");
		 * cm.addName(input.next()); System.out.print("�Ƿ�������룿(y/n):"); flag =
		 * input.next(); } while (!flag.equals("n")); cm.showNames();
		 * 
		 * System.out.println("");
		 *  System.out.println("������Ҫ���ҵĿͻ�������");
		 *  String findname = input.next(); 
		 *  if (cm.search(findname)) {
		 * System.out.println("***��ѯ���***");
		 *  System.out.println("�ҵ��ˣ�"); 
		 * } else{
		 * System.out.println("δ�ҵ���"); }
		
		VipManger vmManger = new VipManger();

		do {
			Vip vip = new Vip();
			System.out.print("�������Ա���:");
			String num = input.next();
			System.out.print("�������Ա����:");
			int score = input.nextInt();
			vip.num = num;
			vip.score = score;
			vmManger.addVip(vip);
			System.out.print("�Ƿ�������룿��y/n��:");
			flag = input.next();
		} while (!flag.equals("n"));
		System.out.println("***��Ա�б�***");
		vmManger.showVips();
	
		System.out.println("������Ҫ���ҵĻ�Ա��ţ�");
		String findnum = input.next(); 
		
		System.out.println("***��ѯ���***");
		System.out.println("�û�Ա����Ϊ"+vmManger.search(findnum)); 
		String names[] = {"mas","kou","ksis","abs"};
		System.out.println("ѧ����������");
		for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
		}
		sortArray sa =new sortArray();
		sa.sortStringArray(names);
		System.out.println("***�����***");
		for(int i = 0; i < names.length; i++){		
			System.out.print(names[i]+"\t");
		}
		Students stu = new Students();
		Score sc = new Score();
		double avg=0;
		System.out.print("������java�ɼ���");
		stu.java = input.nextDouble();
		System.out.print("������database�ɼ���");
		stu.database = input.nextDouble();
		System.out.print("������html�ɼ���");
		stu.html = input.nextDouble();
		avg = sc.getAvg(stu);
		System.out.println("������ƽ����Ϊ"+avg);*/
		Students[] stu =new Students[30];
		Height height =new Height();
	for (int i = 0; i < stu.length; i++) {
		System.out.println("�������"+i+"��ѧ�������");
	}
		System.out.println("***��5��ѧ����***");
	}	
}
