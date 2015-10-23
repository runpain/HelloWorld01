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
		User u1 = new User("张三",1); 
		User u2 = new User("李四",1); 
		User u3 = new User("王5",1); 
		User u4 = new User("小1",2); 
		User u5 = new User("小2",2); 
		User u6 = new User("小3",2); 
		DaoImpl ud = new DaoImpl(); 
		ud.addUser(u1); 
		ud.addUser(u2); 
		ud.addUser(u3); 
		ud.addUser(u6); 
		ud.addUser(u5); 
		ud.addUser(u4); 
		System.out.println("\t===用户信息==="); 
		for(int i=0;i<ud.allUser.length;i++){ 
		if(ud.allUser[i]!=null){ 
		System.out.println(ud.allUser[i].getUserInfo()); 
		} 
		} 
		System.out.println("===输出查找的用户信息==="); 
		System.out.println(ud.findUser("小2").getUserInfo()); 
		System.out.println("===输出更新的用户信息==="); 
		User u7 = new User("王5",2); 
		ud.updateUser(u7); 
		System.out.println(ud.findUser("王5").getUserInfo()); */
/*
		Scanner input = new Scanner(System.in);
    	String uname,pwd;
    	System.out.print("请输入用户名： ");
    	uname=input.next();
    	System.out.print("请输入密码： ");
    	pwd=input.next();
    	if( pwd.length()>=6 ){
        	System.out.print("注册成功！ ");
   	 }else{
        	System.out.print("密码长度不能小于6位！");
    	}		

		Scanner input = new Scanner(System.in);
    	String uname,pwd;		
   		System.out.print("请输入用户名： ");
    	uname=input.next();
    	System.out.print("请输入密码： ");
    	pwd=input.next();		
   		if( uname.equals("TOM") && pwd.equals("1234567") ){
    		System.out.print("登录成功！ ");
    	}else{
    		System.out.print("用户名或密码不匹配，登录失败！");
    	}
		Scanner input = new Scanner(System.in);
    	System.out.print("请输入一串数字： ");
    	String nums = input.next();
    	StringBuffer str=new StringBuffer(nums);
    	for(int i=str.length()-3;i>0;i=i-3){
        		str.insert(i,',');
    	}
    	System.out.print(str);*/
		 Goods gb = new Goods();
	       Scanner input = new Scanner(System.in);
	       do{
	    	   System.out.print("请输入用户名:");
	    	   String username =input.next();
	    	   System.out.print("请输入密码:");
	    	   String pwd =input.next();
	    	   if(gb.login(username, pwd)){
	    		   break;
	    	   }
	       }while(true); System.out.println("登陆成功!");
	      
	       
	      gb.show();
	      System.out.print("请输入您批发的商品编号:");
	      int id = input.nextInt();
	      System.out.print("请输入批发数量:");
	      int num = input.nextInt();
	    System.out.println("您需要付款:"+gb.change(gb.sum(id, num)));
	}

	}


