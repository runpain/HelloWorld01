package cn.zucc.day04_zuoye;

public class Tip extends Topic {
String title;
String content;
String publishTimeString;
int uid;
public void getInfo(){
	System.out.println("===������Ϣ===");
	System.out.println("���ӱ���:�һ��ü̳���");
	System.out.println("�������ݣ�����");
	System.out.println("����ʱ�䣺2010-10-1 12��01��10\n");
}
	public Tip() {
	super();
	System.out.println("�������޲ι��췽��");}
	
	public Tip(String title, String content, String publishTime, int uid) {
		super();
		this.title = title;
		this.content = content;
		this.publishTimeString = publishTime;
		this.uid = uid;
		System.out.println("�������вι��췽��");
	}
	
}

