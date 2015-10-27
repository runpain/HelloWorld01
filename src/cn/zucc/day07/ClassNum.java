package cn.zucc.day07;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ClassNum {
	public void choice() throws Exception {
		Scanner input=new Scanner(System.in);
		int choiceC = input.nextInt();
		switch (choiceC) {
		case 1:
			System.out.println("c#");
			break;
		case 2:
			System.out.println("c”Ô—‘");
			break;
		case 3:
			System.out.println("Java");
			break;
		default:
			throw new Exception() ;
		
		}

	}

}
