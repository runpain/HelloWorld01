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
		/*Penguin pen1 = new Penguin("����", "Q��");
		Penguin pen2 = new Penguin("���", "Q��");
		Penguin pen3 = new Penguin("�õ�", "Q��");
		List<Penguin> list = new ArrayList<Penguin>();
		list.add(pen1);
		list.add(pen2);
		list.add(pen3);
		
		System.out.println("ɾ��ǰ������" + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			Penguin pen = list.get(i);
			System.out.println("����Ϊ" + pen.getName() + "\t�Ա�Ϊ" + pen.getSex());
		}
		
		list.remove(0);
		
		System.out.println("ɾ����������" + list.size());
		for (int i = 0; i < list.size(); i++) {
			Penguin pen = list.get(i);
			System.out.println("����Ϊ" + pen.getName() + "\t�Ա�Ϊ" + pen.getSex());
		}
		
		if (list.contains(pen1)) {
			System.out.println("��������");
		} else {
			System.out.println("����������");
		}*/
		/*Scanner input = new Scanner(System.in);
		LinkedList <Penguin> list = new LinkedList<Penguin>();
		String flag ;
	do {
			Penguin penguin = new Penguin();
			System.out.print("�������������֣�");
			penguin.setName(input.next());
			System.out.print("�����������Ա�");
			penguin.setSex(input.next());
			list.add(penguin);
			System.out.print("�Ƿ�������루y/n��:");
			flag = input.next();
		} while ("y".equals(flag));
			System.out.print("����ӵ�һֻ��������:");
			Penguin penguin1= new Penguin();
			penguin1.setName(input.next());
			System.out.print("����ӵ�һֻ�����Ա�:");
			penguin1.setSex(input.next());
			list.addFirst(penguin1);
			System.out.print("��������һֻ��������:");
			Penguin penguin2= new Penguin();
			penguin2.setName(input.next());
			System.out.print("��������һֻ�����Ա�:");
			penguin2.setSex(input.next());
			list.addLast(penguin2);
			System.out.println("ɾ��ǰ������:" + list.size()+"\n����б�Ϊ:");
			for (int i = 0; i < list.size(); i++) {
				Penguin pen = list.get(i);
				System.out.println("����Ϊ:" + pen.getName() + "\t\t�Ա�Ϊ:" + pen.getSex());
			}
			list.removeFirst();
			System.out.println("ɾ����������:" + list.size()+"\n����б�Ϊ:");
			for (int i = 0; i < list.size(); i++) {
				Penguin pen = list.get(i);
				System.out.println("����Ϊ��" + pen.getName() + "\t�Ա�Ϊ:" + pen.getSex());
			}
			
			if (list.contains(penguin1)) {
				System.out.println("���е�һֻ���");
			} else {
				System.out.println("��������һֻ���");
			}		*/
	/*	

		Map countries = new HashMap();
		countries.put("CN", "�л����񹲺͹�");
		countries.put("RU", "����˹����");
		countries.put("FR", "���������͹�");
		countries.put("US", "��������ڹ�");
		
		String country = (String) countries.get("CN");
		System.out.println("CN��Ӧ�Ĺ����ǣ�" + country);
		
		System.out.println("Map�й���"+countries.size()+"������");
		
		countries.remove("FR");
		System.out.println("Map�а���FR��key��" + 
				countries.containsKey("FR"));
		
		System.out.println( countries.keySet() ) ;
		System.out.println( countries.values() );
		System.out.println( countries );*/
//		Penguin pen1 = new Penguin("����", "Q��");
//		Penguin pen2 = new Penguin("���", "Q��");
//		Penguin pen3 = new Penguin("�õ�", "Q��");
//		Set<Penguin> list = new HashSet<Penguin>();3
//		list.add(pen1);
//		list.add(pen2);
//		list.add(pen3);
	

		/*for (int i = 0; i < list.size(); i++) {
			Penguin pen = list.get(i);
			System.out.println("����Ϊ" + pen.getName() + "\t�Ա�Ϊ" + pen.getSex());
		}*/
//		Penguin pen1 = new Penguin("����", "Q��");
//		Penguin pen2 = new Penguin("���", "Q��");
//		Penguin pen3 = new Penguin("�õ�", "Q��");
		Set <Integer> list = new TreeSet<Integer>();
		list.add(5);
		list.add(2);
		list.add(3);

		for (Integer pengui:list) {
			System.out.println(pengui);
			
		}
		
		
		
		

	}

}
