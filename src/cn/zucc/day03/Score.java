package cn.zucc.day03;

public class Score {
	public double getAvg(Students stu){
		double avg=0;
		avg = (stu.java+stu.database+stu.html)/3;
		return avg;
	}
}
