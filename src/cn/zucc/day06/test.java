package cn.zucc.day06;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] animals = new Animal[3];
		animals[0] = new Cat("�ӷ�è", 4);
		animals[1] = new Duck("��СѼ", 2);
		animals[2] = new Dolphin("��������");

		System.out.println("��������\t�ȵ�����\t�����");

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Cat) {
				Cat cat = (Cat) animals[i];
				cat.show();
				cat.shout();
			} else if (animals[i] instanceof Terrestrial) {
				Duck duck = (Duck) animals[i];
				System.out.print(duck.getName() + "\t" + duck.getLegNum()+ "\t");
				animals[i].shout();
			} else {
				System.out.print(animals[i].getName() + "\t0\t");
				animals[i].shout();
			}
		}
	}
}
