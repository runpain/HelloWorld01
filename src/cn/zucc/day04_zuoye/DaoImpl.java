package cn.zucc.day04_zuoye;

public class DaoImpl implements UserDao {

	public User allUser[] = new User[20];// �����û���Ϣ������

	public User findUser(String uname) {// �����ֲ�����Ϣ
		for (int i = 0; i < allUser.length; i++) {
			if (allUser[i].getUname() == uname) {
				return allUser[i];
			}
		}
		return null;
	}

	public int addUser(User user) {// �����û�
		for (int i = 0; i < allUser.length; i++) {
			if (allUser[i] == null) {
				allUser[i] = user;
				return 1;
			}
		}
		return 0;
	}

	public int updateUser(User user) {// �����û�
		User userOne = this.findUser(user.getUname());// ����ǰ�����û��Ƿ����
		if (userOne != null) {
			userOne.setUname(user.getUname());
			userOne.setTenger(user.getTenger());
			return 1;
		} else {
			return this.addUser(user);// ����޴��û������Ӵ��û�
		}
	}
}
