package cn.zucc.day06;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DVDmgr {
	Scanner input=new Scanner(System.in);
	DVDSet ds=new DVDSet();
	
	public void startMenu() throws ParseException{
		boolean tag=false;
		do{
		System.out.println("\t\t��ӭʹ������DVD������");
		System.out.println("--------------------------------------------");
		System.out.println("\t\t1.��    ��   DVD");
		System.out.println("\t\t2.��    ��   DVD");
		System.out.println("\t\t3.ɾ    ��   DVD");
		System.out.println("\t\t4.��    ��   DVD");
		System.out.println("\t\t5.��    ��   DVD");
		System.out.println("\t\t6.��    ��   DVD");
		System.out.println("--------------------------------------------");
		System.out.print("��ѡ��");
		int choice=input.nextInt();
		switch (choice) {		
		case 1:
			add();
			tag=false;
			break;
		case 2:
			search();
			tag=false;
			break;
		case 3:
			delete();
			tag=false;
			break;
		case 4:
			lend();
			tag=false;
			break;
		case 5:
			relend();
			tag=false;
			break;
		case 6:
			System.out.println("ллʹ������DVD!");
			tag=false;
			break;
		default:
			System.out.println("������������������....");
			tag=true;
		}
		}while(tag);
	}
	
	public void reMenu() throws ParseException{
		boolean flag=false;
		System.out.print("����0���أ�");
		do{
		if(input.nextInt()==0){
			startMenu();
		}else{
			System.out.println("����������������������...");
			flag=true;
		}
		}while(flag);
	}
	
	public void initial(){
		ds.name[0]="�������";
		ds.date[0]="2010-07-01";
		ds.state[0]=0;
		
		ds.name[1]="�������";
		ds.state[1]=1;
		
		ds.name[2]="��������";
		ds.state[2]=1;
	}
	/*����һ���黹DVD����*/
	public void relend() throws ParseException {
		System.out.println("----> �黹DVD");
		System.out.print("��������Ҫ�黹��DVD���ƣ�");
		String Name=input.next();
		for (int i = 0; i < ds.name.length; i++) {
			if(ds.name[i].equals(Name)&&ds.state[i]==0){
			ds.state[i]=1;
			System.out.println("������黹���ڣ�yyyy-mm-dd");	
			String date=input.next();
			System.out.println("�黹<<"+ds.name[i]+">>�ɹ���");
			System.out.println("�������Ϊ:"+ds.date[i]);
			System.out.println("�黹����Ϊ:"+date);
			double Money=charge(ds.date[i],date);
			System.out.println("Ӧ�����Ϊ:"+Money);
			break;
			}else if(ds.name[i].equals(Name)&&ds.state[i]==0){
			System.out.println("��<<"+ds.name+">>�Ѿ�������ˣ�");
			}else if(ds.name[i]==null) {
				System.out.println("û�������Խ��DVD��");
				break;
			}		
		}
		reMenu();
		System.out.println("********************************************");
	}
	
	public double charge(String date1, String date2) throws ParseException {
		double TotalMoney=0;
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
		TotalMoney=(sd.parse(date2).getTime()-sd.parse(date1).getTime())/(24*60*60*1000);
		return TotalMoney;
	
	}
	/*����һ���������*/
	public void lend() throws ParseException {
		System.out.println("----> ���DVD");
		System.out.print("��������Ҫ�����DVD���ƣ�");
		String Name=input.next();
		for (int i = 0; i < ds.name.length; i++) {
		 if(ds.name[i]==null) {
				System.out.println("û�������Խ��DVD��");
				break;
			}else if(ds.name[i].equals(Name)&&ds.state[i]==1){
			ds.state[i]=0;
			System.out.println("�����������ڣ�yyyy-mm-dd");
			ds.date[i]=input.next();
			System.out.println("��<<"+ds.name[i]+">>�ɹ���");
		
			break;
			}else if(ds.name[i].equals(Name)&&ds.state[i]==0){
			System.out.println("��<<"+ds.name[i]+">>�Ѿ�������ˣ�");
			break;
			}		
		}
		reMenu();
		System.out.println("********************************************");
	}
	/*����ɾ������*/
	public void delete() throws ParseException {
		boolean flag=false;	
		System.out.println("----> ɾ��DVD");
		System.out.print("��������Ҫɾ����DVD���ƣ�");
		String Name=input.next();
		for (int i = 0; i < ds.name.length; i++) {
			if(ds.name[i]!=null&&ds.state[i]==1&&ds.name[i].equals(Name)){
				int j=i;	
				while(ds.name[j+1]!=null){
					ds.name[j]=ds.name[j+1];
					ds.state[j]=ds.state[j+1];
					ds.date[j]=ds.date[j+1];
					j++;
				}
				ds.name[j]=null;
				ds.date[j]=null;
				System.out.println("ɾ��<<"+ds.name[i]+">>�ɹ���");
				flag=true;
				break;
				}else if(ds.name[i]!=null&&ds.state[i]==0&&ds.name[i].equals(Name)){
					System.out.println("<<"+ds.name[i]+">>"+"Ϊ���״̬���޷�ɾ����");
					flag=true;
					break;
				}
			
		}
		if(!flag){
			System.out.println("Sorry,û��ƥ�䵽��Ҫɾ����DVD���ƣ�");
		}
		reMenu();
		System.out.println("********************************************");
	}	
	/*��ѯ����*/
	public void search() throws ParseException {
		System.out.println("----> �鿴DVD");
		System.out.println("���\t\t״̬\t\t����\t\t�������");
		for (int i = 0; i < ds.name.length; i++) {
			if(ds.name[i]==null){
				break;
			}else if(ds.state[i]==0){
			System.out.println((i+1)+"\t\t"+"�ѽ��"+"\t\t<<"+ds.name[i]+">>"+"\t"+ds.date[i]);	
			}else if(ds.state[i]==1){
			System.out.println((i+1)+"\t\t"+"�ɽ�"+"\t\t<<"+ds.name[i]+">>");	
			}		
		}
		reMenu();
		System.out.println("********************************************");
	}	
	/*��ӷ���*/
	public void add() throws ParseException {
	System.out.println("----> ����DVD");
	System.out.print("��������Ҫ���ӵ�DVD���ƣ�");
	String Name=input.next();
	for (int i = 0; i < ds.name.length; i++) {
		if(ds.name[i]==null){
			ds.name[i]=Name;
			ds.state[i]=1;
			System.out.println("������"+Name+"���ɹ���");
			break;
		}		
	}
	reMenu();
	System.out.println("********************************************");
	}	
	public class DVDSet {
	 String [] name=new String [100];	//�����洢DVD����
	 String [] date=new String [100];	//�����洢DVD�������
	 int [] state=new int [100];		//�����洢DVD״̬��1��ʾ�ɽ裬0��ʾ�Ѿ����
	}

}









