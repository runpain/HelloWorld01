package cn.zucc.day03;
/*
public class Test {
	/*
	 * public String test (String fruit){ String juice = fruit + "֭"; return
	 * juice; } String[]names = new String [30]; public void addname (String
	 * name){ } public void showNames(){
	 * 
	 * }
	 
	String[] names = new String[30];

	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}

	public void showNames() {
		System.out.println("**************************");
		System.out.println("\t" + "�ͻ������б�:");
		System.out.println("**************************");
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				break;
			}
			System.out.print(names[i] + "\t");
		}
	}

	public boolean search(String name) {

		for (int j = 0; j <i; j++) {
			if (name1[j].equal(name)) {
				return true;
			}
		}
				return false;	
	}
}*/
import java.util.Scanner;

public class Test {
	String[] names = new String[30];
	int i = 0;

	public void addName(String name) {
		names[i] = name;
		i++;
	}

	public void showNames() {
		System.out.println("************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("************************");
		for (int j = 0; j < i; j++) {
			System.out.print(names[j] + "\t");
		}
	}
	public boolean search(String name) {
		for (int j = 0; j < i; j++) {

			if (names[j].equals(name)) {
				return true;
			}

		}
		return false;
	}
}