package cn.zucc.day01;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*String brand = "������F928";
	System.out.print(brand);
		double weight = 12.4;
		System.out.print(weight);
		String type = "����﮵��";
		System.out.print(type);
		int price = 499;
		System.out.print(price);
		int days = 46;
		int week =days / 7;
		int leftDay= days % 7;
		System.out.println("ʣ���������"+leftDay);
		System.out.print("����:"+week);
		double pi = 3.141592;
		double radius = 1.5;
		double area = pi * radius;
		System.out.print("Բ�����Ϊ��"+area);
		double avgScore = 81.29;
		int rise = 2;
		double newScore = avgScore + rise;
		System.out.println("�µ�ƽ����Ϊ��"+newScore);
		int lisi = 80;
		boolean isBig;
		Scanner input = new Scanner(System.in);
		System.out.println("����ѧԱ�����ɼ���");
		int zhangSan = input.nextInt();
		isBig = zhangSan > lisi;
		System.out.println("�����ɼ������ĸ���" + isBig);
		System.out.println("--��ӭ�����Ĵ����--");
		System.out.println("�Ĵ�γ̷���:");
		System.out.println("1��java�������ʦ��ѵ��   ��ѧ�ѣ�20RMB��");
		System.out.println("2��Android�ֻ�������ѵ����ѧ�ѣ�30RMB��");
		System.out.println("3���Ա�����������ѵ��         ��ѧ�ѣ�10RMB��");
		System.out.println("4��Ƕ��ʽ����ʦ��ѵ��         ��ѧ�ѣ�30RMB��");
		Scanner input = new Scanner(System.in);
		System.out.println("������μ�java�������ʦ��ѵ��ѧԱ������");
		int javastudent = input.nextInt();
		System.out.println("������μ�android�ֻ�������ѵ��ѧԱ������");
		int androidstudent = input.nextInt();
		System.out.println("������μ��Ա�����������ѵ��ѧԱ������");
		int taobaostudent = input.nextInt();
		System.out.println("������μ�Ƕ��ʽ����ʦ��ѵ��ѧԱ������");
		int putinstudent = input.nextInt();
		System.out.println("�����������ܵ��ۿ���8���Żݣ�����");
		double befschoolfee = javastudent*20+androidstudent*30+taobaostudent*10+putinstudent*30;
		System.out.println("������ǰ֧����ѧ�ѣ�" +befschoolfee);
		double aftschoolfee = befschoolfee * 0.8;
		System.out.println("�ۺ���Ӧ��֧����ѧ�ѣ�" + aftschoolfee);
		System.out.println("��֧����");
		double money = input.nextDouble();
		System.out.println("ʵ��֧����" + money);
		double charge = money - aftschoolfee;
		System.out.println("���㣺" + charge);
		int  score = (int)money/100;
		System.out.println("���û��֣�" + score);
		System.out.println("ף��ѧϰ���!");
		*/
		System.out.println("ѧ�Ÿ�λ������֮�͵���20�ı�������ѧ��");
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧԱ����λѧ�ţ�");
		int IDnum = input.nextInt();
		int sum = IDnum%100/10+IDnum%10+IDnum%1000/100+IDnum/1000;
		System.out.println("���ѧ�Ÿ�λ�ϵ������ǣ�" + sum);
		boolean equal;
		equal = sum == 20;
		System.out.println("��������ѧ����" + equal);
		
		}
		
	}

