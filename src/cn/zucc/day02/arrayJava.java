package cn.zucc.day02;

import java.awt.im.InputContext;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class arrayJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] num = {};
		//Scanner input = new Scanner(System.in);
		//for(int i = 0; i < 30; i ++){
		//     score[i] = input.nextInt();
		/*int[] num = {8,4,2,1,23,344,12};	
		int sum =0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			
		}
		System.out.println("输出的所有数值的和为" + sum);
		}

		int[] num = {8,4,2,1,23,344,12};
		for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
			
		}
		int[] num = {8,4,2,1,23,344,12};
		int flag=0;
		Scanner input =new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int num1 =input.nextInt();
		for (int i = 0; i < num.length; i++) {
	    if (num1 == num[i] ){
				System.out.println("这个数字包含在数列中");
				
			}else{
	    System.out.println("这个数字不包含在数列中");
		}
		}for (int i = 0; i < num.length; i++) {
		    if (num1 == num[i] ){
		    	flag=1;
				break;	
				}else{
					flag=0;
		  
			}
			}
			if(flag==1){
				System.out.println("这个数字包含在数列中");
			}else{
				  System.out.println("这个数字不包含在数列中");
			
	
		System.out.println("请输入会员本月的消费记录");
		Scanner input =new  Scanner(System.in);
		//double[] money ;
	    //money = new double[5];
		double[] money = new double[5];
		for (int i = 0; i < 5; i++) {
		System.out.print("请输入"+(i+1)+"笔购物金额:");
		money[i] = input.nextDouble();  
		}
		System.out.println("序号"+"\t\t"+"金额(元)");
		for (int j = 0; j < money.length; j++) {
		System.out.println((j+1)+"\t\t"+money[j]);
		}
			double sum = 0;
			for (int  i = 0; i < money.length; i++) {
				sum +=money [i]; 
			}
				System.out.println("总金额"+sum);

			System.out.println("请输入5位学员的成绩:");
			Scanner input = new Scanner(System.in);
			int []score=new int[5];
			for (int i = 0; i < 5; i++) {
				score[i]=input.nextInt();
			}
			System.out.println("成绩升序排列:");
			Arrays.sort(score);
			for (int i = 0; i < score.length; i++) {
				System.out.print(score[i]+ "  ");
				
			}*/
		int[]score = {85,99,82,63,60};
		Arrays.sort(score);
		for (int i = score.length-1; i >= 0; i--) {
			System.out.println(score[i]+"\t");
			
		}
		System.out.println("最大的数字是" + score[4]);
			
		
	}
}