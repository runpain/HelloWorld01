package cn.zucc.day04_zuoye;

import java.util.List;

public class Goods {

	public void show() {
		System.out.println("*********��ӭ������Ʒ������***********");
		System.out.println("\t���\t" + "��Ʒ\t\t" + "�۸�\t\t");
		System.out.println("\t1\t" + "�����\t\t" + "124.23\t");
		System.out.println("\t2\t" + "ϴ�»�\t\t" + "4,500.0\t");
		System.out.println("\t3\t" + "���ӻ�\t\t" + "8,800.9\t");
		System.out.println("\t4\t" + "����\t\t" + "5,000.88\t");
		System.out.println("\t5\t" + "�յ���\t\t" + "4,456.0\t");
		System.out.println("**************************************");
	}

	public boolean login(String username, String pwd) {
		if (username.equalsIgnoreCase("tom") && pwd.equals("123")) {
			return true;
		} else {
			System.out.println("�û��������벻ƥ�䣬��¼ʧ�ܣ�");
		}
		return false;

	}

	public double sum(int id, int num) {
		double money = 0;
		if (id == 1) {
			money = (num * 124.23);
		
		} else if (id == 2) {
			money = (num * 4500.0);

		} else if (id == 3) {
			money = (num * 8800.9);
	
		} else if (id == 4) {
			money = (num * 5000.88);
	

		} else if (id == 5) {
			money = (num * 4456.0);
		}
		return money;
	}

	public String change(double money1) {
		StringBuffer moneys = new StringBuffer(money1 + "");
		int index = moneys.indexOf(".");
		for (index = index - 3; index > 0; index = index - 3) {
			moneys.insert(index, ",");
		}
		return moneys.toString();
	}
}
