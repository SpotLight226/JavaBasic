package day10.abstract_.bad;

public class Store {
	// 추상메서드가 없다면?
	// 자식 클래스에서 반드시 오버라이딩을 했어야 했는데, 깜빡하고 하지 않은 경우에 잘못된 메서드로 실행된다
	public void melon() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
	
	public void orange() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
	
	public void grape() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
	
	public void apple() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
}
