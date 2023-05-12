package quiz11;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 매개변수 3개인 생성자를 사용 시
		KeyBoard key = new KeyBoard();
		Monitor monitor = new Monitor();
		Mouse mouse = new Mouse();
		
		Computer com = new Computer(key, monitor, mouse);
		com.computerInfo();
		
		// getter
		Monitor m = com.getMonitor();
		m.info();
	}
}
