package cn.zucc.day01;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*String brand = "爱国者F928";
	System.out.print(brand);
		double weight = 12.4;
		System.out.print(weight);
		String type = "内置锂电池";
		System.out.print(type);
		int price = 499;
		System.out.print(price);
		int days = 46;
		int week =days / 7;
		int leftDay= days % 7;
		System.out.println("剩余的天数："+leftDay);
		System.out.print("周数:"+week);
		double pi = 3.141592;
		double radius = 1.5;
		double area = pi * radius;
		System.out.print("圆的面积为："+area);
		double avgScore = 81.29;
		int rise = 2;
		double newScore = avgScore + rise;
		System.out.println("新的平均分为："+newScore);
		int lisi = 80;
		boolean isBig;
		Scanner input = new Scanner(System.in);
		System.out.println("输入学员张三成绩：");
		int zhangSan = input.nextInt();
		isBig = zhangSan > lisi;
		System.out.println("张三成绩比李四高吗？" + isBig);
		System.out.println("--欢迎来到文达教育--");
		System.out.println("文达课程服务:");
		System.out.println("1、java软件工程师培训。   （学费：20RMB）");
		System.out.println("2、Android手机开发培训。（学费：30RMB）");
		System.out.println("3、淘宝开店销售培训。         （学费：10RMB）");
		System.out.println("4、嵌入式工程师培训。         （学费：30RMB）");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入参加java软件工程师培训的学员人数：");
		int javastudent = input.nextInt();
		System.out.println("请输入参加android手机开发培训的学员人数：");
		int androidstudent = input.nextInt();
		System.out.println("请输入参加淘宝开店销售培训的学员人数：");
		int taobaostudent = input.nextInt();
		System.out.println("请输入参加嵌入式工程师培训的学员人数：");
		int putinstudent = input.nextInt();
		System.out.println("！！！你享受的折扣是8折优惠！！！");
		double befschoolfee = javastudent*20+androidstudent*30+taobaostudent*10+putinstudent*30;
		System.out.println("您打折前支付总学费：" +befschoolfee);
		double aftschoolfee = befschoolfee * 0.8;
		System.out.println("折后你应该支付的学费：" + aftschoolfee);
		System.out.println("请支付：");
		double money = input.nextDouble();
		System.out.println("实际支付：" + money);
		double charge = money - aftschoolfee;
		System.out.println("找零：" + charge);
		int  score = (int)money/100;
		System.out.println("你获得积分：" + score);
		System.out.println("祝你学习愉快!");
		*/
		System.out.println("学号各位上数字之和等于20的本期幸运学生");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学员的四位学号：");
		int IDnum = input.nextInt();
		int sum = IDnum%100/10+IDnum%10+IDnum%1000/100+IDnum/1000;
		System.out.println("你的学号各位上的数字是：" + sum);
		boolean equal;
		equal = sum == 20;
		System.out.println("你是幸运学生：" + equal);
		
		}
		
	}

