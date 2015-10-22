package cn.zucc.day04_zuoye;

public interface TopicDao {
	public Topic findTopic(int topicId);
	public int addTopic(Topic topic);
	public int deleteTopic(int topicId);
	public int updateTopic(Topic topic);
	int addTopic();
	int addUser();

}
