package day05;

//설계도로 사용 할 클래스는 main이 없다
public class Pen {
	
	// 클래스 속성(값저장)을 나타낼 때 멤버변수(field) 라고 한다
	int price; //가격
	String ink; // 색상
	String company; // 회사
	// 여기까지 멤버변수
	
	//클래스 안의 기능을 나타낼 때, 메서드라고 한다
	//메서드는 클래스의 인스턴스 변수를 사용할 수 있다
	void write() {
		System.out.println(ink + "색상 글씨를 씁니다");
	}
	
	void info() {
		System.out.println("========펜의 정보=========");
		System.out.println("가격: " + price);
		System.out.println("색상: " + ink);
		System.out.println("제조사: " + company);
	}
}
