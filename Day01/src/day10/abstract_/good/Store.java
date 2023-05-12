package day10.abstract_.good;

abstract public class Store { // 추상 클래스
	
	/* 추상클래스, 메서드 규칙
	 * 
	 * 1. 메서드에 abstract를 붙이면 추상메서드가 된다 (오버라이딩을 강제화 하고 싶을 때) 
	 * 2. 추상 메서드는 몸체가 없는 메서드 선언이다
	 * 3. 추상 메서드를 쓰고 싶다면, 추상클래스가 되어야 한다
	 * 4. 추상 클래스도 메서드, 생성자, 변수 전부 다 가질 수 있다
	 * 
	 */
	
	// 추상 메서드
	public abstract void apple();
	public abstract void grape();
	public abstract void orange();
	public abstract void melon();
	
	private String name = "호식이치킨";
	
	public Store() {
		System.out.println("추상클래스 생성자 호출");
	}
	
	public void newMenu() {
		System.out.println("본점만 가지고 있는 신메뉴");
	}
	//name의 getter
	public String getName() {
		return name;
	}
	
}
