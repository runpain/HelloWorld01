package cn.zucc.day03;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class homeWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int  x=4,y=2,z;
		z= x&y;
		System.out.println("(1)"+z);
		z=x|y;
		System.out.println("(2)"+z);
		z=x^y;
		System.out.println("(3)"+z);
		z=x>>y;
		System.out.println("(4)"+z);
		z=~x;
		System.out.println("(5)"+z);
		z=x<<y;
		System.out.println("(6)"+z);
		z=x>>>y;
		System.out.println("(7)"+z);
	
		int x=10,y=20,z=30;
		boolean flag;
		flag = x<10 ||x<10;
		System.out.println("(1)"+flag);
		flag = x>y&&y>x;
		System.out.println("(2)"+flag);
		flag = (x<y+z)&&(x+10<=20);
		System.out.println("(3)"+flag);
		flag = z-y==x&&(y-z)==x;
		System.out.println("(4)"+flag);
		flag = x<10&&y>x;
		System.out.println("(5)"+flag);
		flag = x>y||y>x;
		System.out.println("(6)"+flag);
		flag = !(x<y+z)&&!(x+10<=20);;
		System.out.println("(7)"+flag);
		flag = (!(x==y))&&(x!=y)&&(x<y&&y<x);
		System.out.println("(8)"+flag);
		double  x,y;	
		System.out.println("������x��ֵ��");
		Scanner sc = new Scanner(System.in);
		x=sc.nextDouble();	
		if (x < 1) {
			y= x;
		}else if (x<10) {
			y=3*x-2;
		}else {
			y=4*x;	
		}	
		System.out.println("y��ֵΪ��"+y);	
		double k;
		for (k=1;k<=5;k++)
		{
		if (k>4) break;
		System.out.println("k="+k);
		int k = 10;
		int sum = 0;
		for(int i=1;i<=k;i++){
		sum +=i*i;
		}
		System.out.println("��Ϊ"+sum);
		int []num=new int[3];
		System.out.println("������:");
		Scanner input= new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			num[i]=input.nextInt();
		}
		Arrays.sort(num);
		System.out.print("����Ϊ");
		for (int i = 0; i < 3; i++) {
	
			System.out.print(num[i]+" ");
		}
		int i,j;
		for ( i = 1; i <=100; i++) {
			for (j = 2; j < i; j++) {
				if (i%j==0) {
					break;
				}
				
			}if (i==j) {
				System.out.println("����Ϊ��"+i);
				}
		
				}	
		int i,j;
		for (i=1;i<10;i++){
		for (j=1;j<10;j++){
		System.out.print(i+"*"+j+"="+i*j+" ");
		}
		     System.out.println();
		}
		int []num=new int[5];
		System.out.println("������:");
		Scanner input= new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			num[i]=input.nextInt();
		}
		Arrays.sort(num);
		System.out.print("����Ϊ");
		for (int i = 0; i < 5; i++) {
	
			System.out.print(num[i]+" ");
			
		}System.out.println("���ֵ��"+num[4]+"\t��Сֵ��"+num[0]);
		
		int i,j;
		for (i = 0; i <3 ; i++) {
			for (j = 0; j< i; j++) {
				System.out.println("*");
				
			}
			
		}
		
			Scanner sc =new Scanner(System.in);
			System.out.println("�������ַ���:");
			String string =sc.next();
			
			int a=string.indexOf("abc");
			if(a!=-1){
				System.out.println("�����ַ���abc");
			}else {
				System.out.println("�������ַ���abc");
			}
		
			*/

		String s = "sdfKJjKjjsjdfKKJkjkjSDFsdf";
		String s1 = "", s2 = "", s3;
		for (int i = 0; i < s.length(); i++) {
			s3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			if (s3.indexOf(s.charAt(i)) != -1) {
				s1 = s1 + s.charAt(i);
			} else {
				s2 = s2 + s.charAt(i);
			}
		}
		System.out.println("��д��ĸ ��");
		System.out.println(s1);
		System.out.println("Сд��ĸ ��");
		System.out.println(s2);
	}
}



