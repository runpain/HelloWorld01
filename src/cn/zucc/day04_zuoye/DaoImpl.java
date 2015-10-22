package cn.zucc.day04_zuoye;

public class DaoImpl implements UserDao {

	public User allUser[] = new User[20];// 储存用户信息的数组

	public User findUser(String uname) {// 用名字查找信息
		for (int i = 0; i < allUser.length; i++) {
			if (allUser[i].getUname() == uname) {
				return allUser[i];
			}
		}
		return null;
	}

	public int addUser(User user) {// 增加用户
		for (int i = 0; i < allUser.length; i++) {
			if (allUser[i] == null) {
				allUser[i] = user;
				return 1;
			}
		}
		return 0;
	}

	public int updateUser(User user) {// 更新用户
		User userOne = this.findUser(user.getUname());// 更新前查找用户是否存在
		if (userOne != null) {
			userOne.setUname(user.getUname());
			userOne.setTenger(user.getTenger());
			return 1;
		} else {
			return this.addUser(user);// 如果无此用户则增加此用户
		}
	}
}
