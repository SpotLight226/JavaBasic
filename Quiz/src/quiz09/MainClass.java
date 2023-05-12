package quiz09;

public class MainClass {
	
	public static void main(String[] args) {
		
		SuperSonicAp sonic = new SuperSonicAp("종이비행기");
		
		sonic.takeOff();
		sonic.fly(); // 오버라이딩
		sonic.flyMode = 1;
		sonic.fly();
		sonic.land();
	}

}
