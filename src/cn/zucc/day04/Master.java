package cn.zucc.day04;

public class Master {
	public void Cure(Pet pet){
	
			pet.cure();
	
	}
	public void Play (Pet pet){
		if (pet instanceof Dog) {
			((Dog) pet).play();
		}else if(pet instanceof Penguin) {
			((Penguin) pet).swim();
		}
	}
}