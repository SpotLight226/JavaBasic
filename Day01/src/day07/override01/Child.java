package day07.override01;

public class Child extends Parent {
	
	/*
	 * 오버라이딩 규칙
	 * 1. 상속관계를 지녀야 한다
	 * 2. 부모님 메서드의 모형과 같아야한다
	 */
	
	void method02() { // 이름 똑같이
		System.out.println("자식의 오버라이드 된 2번 메서드");
	}
}
