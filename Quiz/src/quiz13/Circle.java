package quiz13;

public class Circle extends Shape {

	/*
	 * 원은 radius변수를 가진다
	 * 원은 생성될 때 이름과, radius를 받을 수 있도록 생성자 선언
	 * getArea() = 원의 넓이를 구하도록 오버라이딩
	 */
	private int radius;
	
	public Circle() {} // 기본
	
	public Circle(String name, int radius) {
		super(name); // 조상의 생성자를 호출하여 name 저장
		this.radius = radius; // 내꺼
	}

	public double getArea() {
		return radius*radius*Shape.PI; // 원의 넓이, PI는 상수(public static final)이므로 클래스이름으로 호출하여 사용
	}
	
	
	
}
