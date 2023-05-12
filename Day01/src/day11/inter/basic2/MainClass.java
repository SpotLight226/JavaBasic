package day11.inter.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = { dog, cat, tiger }; // 다형성 -> 부모타입 배열에 넣을 수 있다
		
		for(Animal ani : animals) {
			ani.eat(); // Animal의 기능
		}
		
		//dog, cat은 인터페이스 타입으로 형변환이 된다
		//dog, cat, goldfish를 저장하고, 반복문으로 IPet의 기능을 사용
		IPet[] pets = new IPet[3];
		
		pets[0] = (IPet)dog;
//		pets[1] = (IPet)tiger; tiger는 IPet 기능이 없기 때문에 error
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish(); // goldfish 객체를 만들어서 넣는다 
		
		for(IPet pet : pets) { // IPet 타입 배열을 돌리므로 IPet pet이다
			pet.play();
		}
		
		System.out.println("-------------------------");
		// dog는 Animal 타입이므로 형변환하여 인터페이스 타입으로 넣어준다
		PetHouse.carePet((IPet)dog);
		PetHouse.carePet((IPet)cat);
		PetHouse.carePet((IPet)pets[2]);
	}
}
