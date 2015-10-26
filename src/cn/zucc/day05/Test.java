package cn.zucc.day05;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Penguin pen1 = new Penguin("琪琪", "Q仔");
		Penguin pen2 = new Penguin("娥娥", "Q妹");
		Penguin pen3 = new Penguin("得得", "Q妹");
		List<Penguin> list = new ArrayList<Penguin>();
		list.add(pen1);
		list.add(pen2);
		list.add(pen3);
		
		System.out.println("删除前数量有" + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			Penguin pen = list.get(i);
			System.out.println("名字为" + pen.getName() + "\t性别为" + pen.getSex());
		}
		
		list.remove(0);
		
		System.out.println("删除后数量有" + list.size());
		for (int i = 0; i < list.size(); i++) {
			Penguin pen = list.get(i);
			System.out.println("名字为" + pen.getName() + "\t性别为" + pen.getSex());
		}
		
		if (list.contains(pen1)) {
			System.out.println("含有琪琪");
		} else {
			System.out.println("不包含琪琪");
		}*/
		/*Scanner input = new Scanner(System.in);
		LinkedList <Penguin> list = new LinkedList<Penguin>();
		String flag ;
	do {
			Penguin penguin = new Penguin();
			System.out.print("请输入企鹅的名字：");
			penguin.setName(input.next());
			System.out.print("请输入企鹅的性别：");
			penguin.setSex(input.next());
			list.add(penguin);
			System.out.print("是否继续输入（y/n）:");
			flag = input.next();
		} while ("y".equals(flag));
			System.out.print("请添加第一只企鹅的名字:");
			Penguin penguin1= new Penguin();
			penguin1.setName(input.next());
			System.out.print("请添加第一只企鹅的性别:");
			penguin1.setSex(input.next());
			list.addFirst(penguin1);
			System.out.print("请添加最后一只企鹅的名字:");
			Penguin penguin2= new Penguin();
			penguin2.setName(input.next());
			System.out.print("请添加最后一只企鹅的性别:");
			penguin2.setSex(input.next());
			list.addLast(penguin2);
			System.out.println("删除前数量有:" + list.size()+"\n企鹅列表为:");
			for (int i = 0; i < list.size(); i++) {
				Penguin pen = list.get(i);
				System.out.println("名字为:" + pen.getName() + "\t\t性别为:" + pen.getSex());
			}
			list.removeFirst();
			System.out.println("删除后数量有:" + list.size()+"\n企鹅列表为:");
			for (int i = 0; i < list.size(); i++) {
				Penguin pen = list.get(i);
				System.out.println("名字为：" + pen.getName() + "\t性别为:" + pen.getSex());
			}
			
			if (list.contains(penguin1)) {
				System.out.println("含有第一只企鹅");
			} else {
				System.out.println("不包含第一只企鹅");
			}		*/
	/*	

		Map countries = new HashMap();
		countries.put("CN", "中华人民共和国");
		countries.put("RU", "俄罗斯联邦");
		countries.put("FR", "法兰西共和国");
		countries.put("US", "美利坚合众国");
		
		String country = (String) countries.get("CN");
		System.out.println("CN对应的国家是：" + country);
		
		System.out.println("Map中共有"+countries.size()+"组数据");
		
		countries.remove("FR");
		System.out.println("Map中包含FR的key吗？" + 
				countries.containsKey("FR"));
		
		System.out.println( countries.keySet() ) ;
		System.out.println( countries.values() );
		System.out.println( countries );*/
//		Penguin pen1 = new Penguin("琪琪", "Q仔");
//		Penguin pen2 = new Penguin("娥娥", "Q妹");
//		Penguin pen3 = new Penguin("得得", "Q妹");
//		Set<Penguin> list = new HashSet<Penguin>();3
//		list.add(pen1);
//		list.add(pen2);
//		list.add(pen3);
	

		/*for (int i = 0; i < list.size(); i++) {
			Penguin pen = list.get(i);
			System.out.println("名字为" + pen.getName() + "\t性别为" + pen.getSex());
		}*/
//		Penguin pen1 = new Penguin("琪琪", "Q仔");
//		Penguin pen2 = new Penguin("娥娥", "Q妹");
//		Penguin pen3 = new Penguin("得得", "Q妹");
		Set <Integer> list = new TreeSet<Integer>();
		list.add(5);
		list.add(2);
		list.add(3);

		for (Integer pengui:list) {
			System.out.println(pengui);
			
		}
		
		
		
		

	}

}
