package cn.zucc.day07;

import java.text.ParseException;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*System.out.print("请输入课程代号（1~3之间的数字）：");
		try {
			ClassNum inNum = new ClassNum();
			inNum.choice();	
		} catch (Exception e) {
			System.out.println("输入有误，请重新输入");
			// TODO: handle exception
		}
		finally{
			System.out.println("欢迎提出建议！");
		}*/
		System.out.println("请输入年龄（1~100之间的数字）：");
		/*Scanner input = new Scanner(System.in);
		
				Age agein= new Age();
				
	            try {
					agein.setAge(input.nextInt());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			
					setAge inputAge = new setAge();
					try {
						inputAge.inputNum();
					} catch (Exception e) {
						
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			

		
	
	
			}
		
		 
	}


