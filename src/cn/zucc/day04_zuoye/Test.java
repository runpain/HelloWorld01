package cn.zucc.day04_zuoye;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Tip tip = new Tip();
		
		tip.getInfo();
		Reply reply = new Reply();
		reply.getInfo();
		reply.getInfo1();
		User user = new User();
		user.addTopic();
		user.addUser();
		user.findUser();
		user.deleteTopic(3);*/
		/*
		User u1 = new User("����",1); 
		User u2 = new User("����",1); 
		User u3 = new User("��5",1); 
		User u4 = new User("С1",2); 
		User u5 = new User("С2",2); 
		User u6 = new User("С3",2); 
		DaoImpl ud = new DaoImpl(); 
		ud.addUser(u1); 
		ud.addUser(u2); 
		ud.addUser(u3); 
		ud.addUser(u6); 
		ud.addUser(u5); 
		ud.addUser(u4); 
		System.out.println("\t===�û���Ϣ==="); 
		for(int i=0;i<ud.allUser.length;i++){ 
		if(ud.allUser[i]!=null){ 
		System.out.println(ud.allUser[i].getUserInfo()); 
		} 
		} 
		System.out.println("===������ҵ��û���Ϣ==="); 
		System.out.println(ud.findUser("С2").getUserInfo()); 
		System.out.println("===������µ��û���Ϣ==="); 
		User u7 = new User("��5",2); 
		ud.updateUser(u7); 
		System.out.println(ud.findUser("��5").getUserInfo()); */
/*
		Scanner input = new Scanner(System.in);
    	String uname,pwd;
    	System.out.print("�������û����� ");
    	uname=input.next();
    	System.out.print("���������룺 ");
    	pwd=input.next();
    	if( pwd.length()>=6 ){
        	System.out.print("ע��ɹ��� ");
   	 }else{
        	System.out.print("���볤�Ȳ���С��6λ��");
    	}		

		Scanner input = new Scanner(System.in);
    	String uname,pwd;		
   		System.out.print("�������û����� ");
    	uname=input.next();
    	System.out.print("���������룺 ");
    	pwd=input.next();		
   		if( uname.equals("TOM") && pwd.equals("1234567") ){
    		System.out.print("��¼�ɹ��� ");
    	}else{
    		System.out.print("�û��������벻ƥ�䣬��¼ʧ�ܣ�");
    	}
		Scanner input = new Scanner(System.in);
    	System.out.print("������һ�����֣� ");
    	String nums = input.next();
    	StringBuffer str=new StringBuffer(nums);
    	for(int i=str.length()-3;i>0;i=i-3){
        		str.insert(i,',');
    	}
    	System.out.print(str);*/
		 Goods gb = new Goods();
	       Scanner input = new Scanner(System.in);
	       do{
	    	   System.out.print("�������û���:");
	    	   String username =input.next();
	    	   System.out.print("����������:");
	    	   String pwd =input.next();
	    	   if(gb.login(username, pwd)){
	    		   break;
	    	   }
	       }while(true); System.out.println("��½�ɹ�!");
	      
	       
	      gb.show();
	      System.out.print("����������������Ʒ���:");
	      int id = input.nextInt();
	      System.out.print("��������������:");
	      int num = input.nextInt();
	    System.out.println("����Ҫ����:"+gb.change(gb.sum(id, num)));
	}

	}


