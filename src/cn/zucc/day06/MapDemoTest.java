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
	/*map.put("CN", "�л����񹲺͹�");
	map.put("FR", "���������͹�");
	map.put("US", "��������ڹ�");
	map.put("RU", "����˹����");
	Scanner input = new Scanner(System.in);
	/*System.out.print("������Ҫ���ҵĹ��ҵ�Ӣ�ļ�ƣ�");
	String enName = input.next();
	System.out.print("����ȫ��Ϊ��"+map.get(enName)+"\n");	*/
/*	System.out.println("Map�й���"+map.size()+"������");
	/*map.remove("FR");
	System.out.println("Map�а���FR��Key��"+map.containsKey("FR"));*/
	/*System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map);*/
	Map<String,String> pet =new HashMap<String, String>();
		pet.put("cat", "è");
		pet.put("dog", "��");
		pet.put("penguin", "���");
		pet.put("fish", "��");
		/*Scanner input  = new Scanner(System.in);	
		String flag;
		do {
			System.out.print("������Ҫ���ҵĳ����ǳƣ�");
			String name = input.next();
			if (pet.get(name)==null) {
				System.out.println("���Ǵ����");		
			}else {
				System.out.println("��ĳ����ǳ�Ϊ" +name+"\t��ĳ���Ϊ"+pet.get(name));
			}		
			System.out.print("�Ƿ�������룿��y/n��:");
			flag = input.next();
		} while ("y".equals(flag));		*/
		String pet1 = pet.get("cat");
		System.out.println("cat��Ӧ����"+pet1);
		
		
		
		
		
		}
	}

		
		
		
	



