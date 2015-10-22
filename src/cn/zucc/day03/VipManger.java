package cn.zucc.day03;

public class VipManger {
	Vip[] vips = new Vip[30];

	public void addVip(Vip vip) {
		for (int i = 0; i < vips.length; i++) {
			if (vips[i] == null) {
				vips[i] = vip;
				break;
			}
		}
	}

	public void showVips() {
		System.out.println("±àºÅ" + "\t" + "»ý·Ö ");

		for (int i = 0; i < vips.length; i++) {
			Vip vip = new Vip();
			if (vips[i] == null) {
				break;
			}
			System.out.println(vips[i].num + "\t" + vips[i].score);
			}
		}
	
		public int search(String num) {
			for (int j = 0; j < vips.length; j++) {
				if(vips[j]==null){
					break;
				}
				if ((vips[j].num).equals(num)) {
					return vips[j].score;
				}
			}
			return 0;
	}
	
	
	
}
