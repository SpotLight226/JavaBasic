package quiz13;

public class Rect extends Shape {

	/*
	 * 정사각형은 side변수를 가진다
	 * 정사각형은 생성될 때 이름과, side를 받을 수 있도록 생성자 선언
	 * getArea() = 정사각형의 넓이를 구하도록 오버라이딩
	 */
	private int side;
	
	public Rect() {} // 기본
	
	public Rect(String name, int side) {
		super(name); // 조상의 생성자를 호출하여 name 저장
		this.side = side; 
	}
	
	@Override
	public double getArea() {
		return side*side; // 정사각형의 넓이
	}
	

}
