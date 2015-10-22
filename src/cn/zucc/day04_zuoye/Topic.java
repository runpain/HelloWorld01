package cn.zucc.day04_zuoye;

public class Topic {
	int topicld;
	int boardld;
	public int getTopicld() {
		return topicld;
	}
	public void setTopicld(int topicld) {
		this.topicld = topicld;
	}
	public int getBoardld() {
		return boardld;
	}
	public void setBoardld(int boardld) {
		this.boardld = boardld;
	}
	public Topic(int topicld, int boardld) {
		super();
		this.topicld = topicld;
		this.boardld = boardld;
	}
	public Topic() {
		super();
	}
	
	
	
}
