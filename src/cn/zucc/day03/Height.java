package cn.zucc.day03;

import cn.zucc.day02.arrayJava;

public class Height {
	public double getAvgHeight(Students[] stu){
		double avgHeight=0;
		double all=0;
		double count=0;
		/*for (int i = 0; i < stu.length; i++) {
			if (stu[i].height!=0) {
				all=all+stu[i].height;
				count++;
			}
		}*/
		avgHeight=all/count;
		return avgHeight;
	}

}
