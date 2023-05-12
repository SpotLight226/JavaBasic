package day05;

public class PenMain {
	
	public static void main(String[] args) {
		
		//펜을 사용하려면 객체로 생성
		Pen red = new Pen(); // Pen() 객체를 만들고 주소값을 참조변수 red에 저장
		red.ink = "빨간색";
		red.price = 2000;
		red.company = "빨간펜";
		
		red.write(); // void 메서드 
		
		Pen black = new Pen(); // 새로운 Pen객체를 만들고 주소값을 참조변수 black에 저장
		black.ink = "검정색";
		black.price = 1000;
		black.company = "모나미"; 
		
		black.write();
		
		red.info();
		black.info();
		
//		black = red; // 참조변수 black의 값을 red의 주소값으로 덮어씌움
//		
//		black.write();
//		black.info();
		
	}
}
