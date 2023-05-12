package day11.inter.basic2;

public class PetHouse {
	// 클래스 메서드 
	public static void carePet(IPet pets) { // 인터페이스 타입을 매개변수로 받는다 : Dog, Cat, GoldFish
		
		if(pets instanceof Dog) {
			Dog dog = (Dog)pets;
			dog.play();
		} else if(pets instanceof Cat) {
			Cat cat = (Cat)pets;
			cat.play();
		} else if(pets instanceof GoldFish) {
			GoldFish fish = (GoldFish)pets;
			fish.play();
		}
		
	}
}
