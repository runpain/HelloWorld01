package cn.zucc.day07;

import java.text.ParseException;
import java.util.Scanner;

public class setAge {
	Scanner inname = new Scanner(System.in );
	int age = inname.nextInt();
	
public void inputNum() throws Exception{
		if(age >=1 && age <= 100){
		System.out.println("年龄为"+age);
	    }else {
			
			throw new Exception("年龄必须在1~100之间！") ;
		}	
	}
}

