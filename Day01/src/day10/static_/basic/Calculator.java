package day10.static_.basic;

public class Calculator {

	/*
	 * 클래스 설계를 할 때, 적절한 곳에 static을 붙이면 좋다
	 * 
	 * 객체마다 다른 값을 가져야 하면 일반 변수,
	 * 객체마다 동일한 값을 가져야 하면 static변수
	 */
	
	private String color; // 객체별로 각기 다른 색상 -> 일반 변수
	public static double pi = 3.14;    // 고정값 3.14 -> static변수
	
	
	/*
	 * 메서드
	 * 
	 * 일반멤버변수(iv)를 사용하는 메서드는 static이면 안된다 ( getter / setter )
	 * 
	 * 일반멤버변수(iv)를 사용하지 않고,
	 * 외부에서 범용성있게 사용할 메서드는 static이면 좋다
	 */
	
	// 객체마다 다른 색상 설정
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() { 
		return color;
	}
	
	// 원의 크기를 구하는 메서드 : 범용성있게 사용
	public static double circle(int r) { 
		return r * r * Math.PI;
	}
	
}
