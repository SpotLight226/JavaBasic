package day06.import_ex;
//다른 패키지에 있다면 import하여 사용한다
import day06.fruit.Apple; // 패키지 명을 포함한 클래스명
import day06.fruit.Melon;
//import day06.fruit.*; // 해당 패키지의 모든 클래스를 사용할 수 있다

public class MainClass {

	public static void main(String[] args) {
		
		Apple app = new Apple();
		Melon mel = new Melon();
		
		}	
	}
