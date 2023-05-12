package day10.final_.basic;

public class Child extends Parent{

	//final클래스 - 상속금지
	//final메서드 - 오버라이딩 금지
	
	public void method01() {
		this.method02();
	}
	
//	public void method02() {
//	}
}
