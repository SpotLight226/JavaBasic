package quiz04;

public class Main {
	
	public static void main(String[] args) {
		
		Warrior wr = new Warrior("이순신"); // 객체 생성 -> 참조변수 wr, 생성자 형식 Warrior(String n)
		Wizard wz = new Wizard("홍길동");
		
		wr.info();
		wz.info();
		
		wr.bash();
		wz.iceArrow();
		System.out.println("==================");
		
		wr.info();
		wz.info();
		
		
	}

}
