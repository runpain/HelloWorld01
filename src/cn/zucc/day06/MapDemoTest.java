package cn.zucc.day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Map<String,String> map =new HashMap<String, String>();
	/*map.put("CN", "中华人民共和国");
	map.put("FR", "法兰西共和国");
	map.put("US", "美利坚合众国");
	map.put("RU", "俄罗斯联邦");
	Scanner input = new Scanner(System.in);
	/*System.out.print("请输入要查找的国家的英文简称：");
	String enName = input.next();
	System.out.print("中文全称为："+map.get(enName)+"\n");	*/
/*	System.out.println("Map中共有"+map.size()+"组数据");
	/*map.remove("FR");
	System.out.println("Map中包含FR的Key吗？"+map.containsKey("FR"));*/
	/*System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map);*/
	Map<String,String> pet =new HashMap<String, String>();
		pet.put("cat", "猫");
		pet.put("dog", "狗");
		pet.put("penguin", "企鹅");
		pet.put("fish", "鱼");
		/*Scanner input  = new Scanner(System.in);	
		String flag;
		do {
			System.out.print("请输入要查找的宠物昵称：");
			String name = input.next();
			if (pet.get(name)==null) {
				System.out.println("这是错误的");		
			}else {
				System.out.println("你的宠物昵称为" +name+"\t你的宠物为"+pet.get(name));
			}		
			System.out.print("是否继续输入？（y/n）:");
			flag = input.next();
		} while ("y".equals(flag));		*/
		String pet1 = pet.get("cat");
		System.out.println("cat对应的是"+pet1);
		
		
		
		
		
		}
	}

		
		
		
	



