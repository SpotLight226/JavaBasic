package day05;

public class PhoneMain {
	
	public static void main(String[] args) {
		
//		new Phone(); // 생성자만 호출
		
		Phone black = new Phone(); // 생성자 호출하며 객체 만듬
		
		black.info();
		
		Phone pink = new Phone("아이폰14"); // Phone 생성자를 이용하여 객체를 만들고, 참조변수 pink에 주소값을 넣
		pink.info();
		
		Phone red = new Phone("TTL","빨강");
		red.info();
		
		Phone white = new Phone("가로본능", 4000);
		white.info();
		
		//model, color, price를 매개변수로 받아서 초기화하는 생성자를 만들어보세요
		//객체생성
		Phone blue = new Phone("갤럭시", "파란색", 50000);
		blue.info();
	}
}
