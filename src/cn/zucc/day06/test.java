package cn.zucc.day06;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] animals = new Animal[3];
		animals[0] = new Cat("加菲猫", 4);
		animals[1] = new Duck("唐小鸭", 2);
		animals[2] = new Dolphin("海豚奇奇");

		System.out.println("动物名字\t腿的条数\t动物叫");

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
