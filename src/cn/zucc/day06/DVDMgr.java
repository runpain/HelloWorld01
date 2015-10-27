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
		System.out.println("\t\t欢迎使用迷您DVD管理器");
		System.out.println("--------------------------------------------");
		System.out.println("\t\t1.新    增   DVD");
		System.out.println("\t\t2.查    看   DVD");
		System.out.println("\t\t3.删    除   DVD");
		System.out.println("\t\t4.借    出   DVD");
		System.out.println("\t\t5.归    还   DVD");
		System.out.println("\t\t6.退    出   DVD");
		System.out.println("--------------------------------------------");
		System.out.print("请选择：");
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
			System.out.println("谢谢使用迷你DVD!");
			tag=false;
			break;
		default:
			System.out.println("输入有误，请重新输入....");
			tag=true;
		}
		}while(tag);
	}
	
	public void reMenu() throws ParseException{
		boolean flag=false;
		System.out.print("输入0返回：");
		do{
		if(input.nextInt()==0){
			startMenu();
		}else{
			System.out.println("您的输入有误，请重新输入...");
			flag=true;
		}
		}while(flag);
	}
	
	public void initial(){
		ds.name[0]="罗马假日";
		ds.date[0]="2010-07-01";
		ds.state[0]=0;
		
		ds.name[1]="风声鹤唳";
		ds.state[1]=1;
		
		ds.name[2]="满屋浪漫";
		ds.state[2]=1;
	}
	/*定义一个归还DVD方法*/
	public void relend() throws ParseException {
		System.out.println("----> 归还DVD");
		System.out.print("请输入需要归还的DVD名称：");
		String Name=input.next();
		for (int i = 0; i < ds.name.length; i++) {
			if(ds.name[i].equals(Name)&&ds.state[i]==0){
			ds.state[i]=1;
			System.out.println("请输入归还日期：yyyy-mm-dd");	
			String date=input.next();
			System.out.println("归还<<"+ds.name[i]+">>成功！");
			System.out.println("借出日期为:"+ds.date[i]);
			System.out.println("归还日期为:"+date);
			double Money=charge(ds.date[i],date);
			System.out.println("应付租金为:"+Money);
			break;
			}else if(ds.name[i].equals(Name)&&ds.state[i]==0){
			System.out.println("此<<"+ds.name+">>已经被借出了！");
			}else if(ds.name[i]==null) {
				System.out.println("没有您可以借的DVD！");
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
	/*定义一个借出方法*/
	public void lend() throws ParseException {
		System.out.println("----> 借出DVD");
		System.out.print("请输入需要借出的DVD名称：");
		String Name=input.next();
		for (int i = 0; i < ds.name.length; i++) {
		 if(ds.name[i]==null) {
				System.out.println("没有您可以借的DVD！");
				break;
			}else if(ds.name[i].equals(Name)&&ds.state[i]==1){
			ds.state[i]=0;
			System.out.println("请输入借出日期：yyyy-mm-dd");
			ds.date[i]=input.next();
			System.out.println("借<<"+ds.name[i]+">>成功！");
		
			break;
			}else if(ds.name[i].equals(Name)&&ds.state[i]==0){
			System.out.println("此<<"+ds.name[i]+">>已经被借出了！");
			break;
			}		
		}
		reMenu();
		System.out.println("********************************************");
	}
	/*定义删除方法*/
	public void delete() throws ParseException {
		boolean flag=false;	
		System.out.println("----> 删除DVD");
		System.out.print("请输入需要删除的DVD名称：");
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
				System.out.println("删除<<"+ds.name[i]+">>成功！");
				flag=true;
				break;
				}else if(ds.name[i]!=null&&ds.state[i]==0&&ds.name[i].equals(Name)){
					System.out.println("<<"+ds.name[i]+">>"+"为借出状态，无法删除！");
					flag=true;
					break;
				}
			
		}
		if(!flag){
			System.out.println("Sorry,没有匹配到您要删除的DVD名称！");
		}
		reMenu();
		System.out.println("********************************************");
	}	
	/*查询方法*/
	public void search() throws ParseException {
		System.out.println("----> 查看DVD");
		System.out.println("序号\t\t状态\t\t名称\t\t借出日期");
		for (int i = 0; i < ds.name.length; i++) {
			if(ds.name[i]==null){
				break;
			}else if(ds.state[i]==0){
			System.out.println((i+1)+"\t\t"+"已借出"+"\t\t<<"+ds.name[i]+">>"+"\t"+ds.date[i]);	
			}else if(ds.state[i]==1){
			System.out.println((i+1)+"\t\t"+"可借"+"\t\t<<"+ds.name[i]+">>");	
			}		
		}
		reMenu();
		System.out.println("********************************************");
	}	
	/*添加方法*/
	public void add() throws ParseException {
	System.out.println("----> 新增DVD");
	System.out.print("请输入需要增加的DVD名称：");
	String Name=input.next();
	for (int i = 0; i < ds.name.length; i++) {
		if(ds.name[i]==null){
			ds.name[i]=Name;
			ds.state[i]=1;
			System.out.println("新增《"+Name+"》成功！");
			break;
		}		
	}
	reMenu();
	System.out.println("********************************************");
	}	
	public class DVDSet {
	 String [] name=new String [100];	//用来存储DVD名称
	 String [] date=new String [100];	//用来存储DVD借出日期
	 int [] state=new int [100];		//用来存储DVD状态，1表示可借，0表示已经借出
	}

}









