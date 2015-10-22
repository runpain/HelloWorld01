package cn.zucc.day04_zuoye;

public class Tip extends Topic {
String title;
String content;
String publishTimeString;
int uid;
public void getInfo(){
	System.out.println("===帖子信息===");
	System.out.println("帖子标题:我会用继承了");
	System.out.println("帖子内容：如题");
	System.out.println("发帖时间：2010-10-1 12：01：10\n");
}
	public Tip() {
	super();
	System.out.println("帖子类无参构造方法");}
	
	public Tip(String title, String content, String publishTime, int uid) {
		super();
		this.title = title;
		this.content = content;
		this.publishTimeString = publishTime;
		this.uid = uid;
		System.out.println("帖子类有参构造方法");
	}
	
}

