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
		 * Test mytest = new Test(); String myFruit = "苹果"; String myJuice =
		 * mytest.test(myFruit); System.out.println(myJuice); Test st = new
		 * Test(); Scanner input = new Scanner(System.in); for (int i = 0; i <
		 * 5; i++) { System.out.println("请输入学生姓名："); String newName=
		 * input.next(); st.addname(newName); } st.showNames();
		 */
		Scanner input = new Scanner(System.in);
		/*String flag;
		
		 * Test cm = new Test(); do { System.out.print("请输入客户的姓名:");
		 * cm.addName(input.next()); System.out.print("是否继续输入？(y/n):"); flag =
		 * input.next(); } while (!flag.equals("n")); cm.showNames();
		 * 
		 * System.out.println("");
		 *  System.out.println("请输入要查找的客户姓名：");
		 *  String findname = input.next(); 
		 *  if (cm.search(findname)) {
		 * System.out.println("***查询结果***");
		 *  System.out.println("找到了！"); 
		 * } else{
		 * System.out.println("未找到！"); }
		
		VipManger vmManger = new VipManger();

		do {
			Vip vip = new Vip();
			System.out.print("请输入会员编号:");
			String num = input.next();
			System.out.print("请输入会员积分:");
			int score = input.nextInt();
			vip.num = num;
			vip.score = score;
			vmManger.addVip(vip);
			System.out.print("是否继续输入？（y/n）:");
			flag = input.next();
		} while (!flag.equals("n"));
		System.out.println("***会员列表***");
		vmManger.showVips();
	
		System.out.println("请输入要查找的会员编号：");
		String findnum = input.next(); 
		
		System.out.println("***查询结果***");
		System.out.println("该会员积分为"+vmManger.search(findnum)); 
		String names[] = {"mas","kou","ksis","abs"};
		System.out.println("学生的姓名：");
		for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
		}
		sortArray sa =new sortArray();
		sa.sortStringArray(names);
		System.out.println("***排序后***");
		for(int i = 0; i < names.length; i++){		
			System.out.print(names[i]+"\t");
		}
		Students stu = new Students();
		Score sc = new Score();
		double avg=0;
		System.out.print("请输入java成绩：");
		stu.java = input.nextDouble();
		System.out.print("请输入database成绩：");
		stu.database = input.nextDouble();
		System.out.print("请输入html成绩：");
		stu.html = input.nextDouble();
		avg = sc.getAvg(stu);
		System.out.println("该生的平均分为"+avg);*/
		Students[] stu =new Students[30];
		Height height =new Height();
	for (int i = 0; i < stu.length; i++) {
		System.out.println("请输入第"+i+"名学生的身高");
	}
		System.out.println("***这5名学生的***");
	}	
}
