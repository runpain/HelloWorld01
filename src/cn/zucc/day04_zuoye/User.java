package cn.zucc.day04_zuoye;

public  class User {/*implements UserDao,TopicDao{

	@Override
	public int addUser() {
		System.out.println("�����û�");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findUser() {
		System.out.println("�����û�");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUser(User user) {
		System.out.println("�޸��û�");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addTopic() {
		System.out.println("��������");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTopic(int topicId) {
		// TODO Auto-generated method stub
		System.out.println("ɾ������");
		return 0;
	}

	@Override
	public Topic findTopic(int topicId) {
		System.out.println("��������");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateTopic(Topic topic) {
		System.out.println("�޸�����");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addTopic(Topic topic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findUser(String uName) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	private String uname; 
	private int tenger; 
	public User(String uname,int tenger){ 
	this.setTenger(tenger); 
	this.setUname(uname); 
	} 
	public String getUname() { 
	return uname; 
	} 
	public void setUname(String uname) { 
	this.uname = uname; 
	} 
	public int getTenger() { 
	return tenger; 
	} 
	public void setTenger(int tenger) { 
	this.tenger = tenger; 
	} 
	public String getUserInfo(){ 
	return "������"+this.getUname()+"\t�Ա�"+(this.getTenger()==1?"��":"Ů"); 
	} 

}
