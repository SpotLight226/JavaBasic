package day07.overload;

public class Basic {
	
	/*
	 * 오버로딩 - 같은 이름의 메서드를 여러개 생성하는 것
	 * 
	 * 규칙
	 * 1. 이름은 똑같다
	 * 2. 접근제한자와 반환유형은 오버로딩에 영향을 미치지 않는다
	 * 3. 매개변수를 다르게 해서 모형을 다르게 해야 한다
	 *    타입, 개수, 순서
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력받음");
	}
	
//	int input(int x) { // 반환 유형은 영향을 미치지 않는다
//		return 0;
//	}
	
	void input(String a) { // 매개변수의 타입이 다르기 때문에 오버로딩 가능
		System.out.println("문자열 1개 입력받음");
	}
	
	void input(int a, double b) { // 매개변수의 타입, 개수 다름
		System.out.println("정수 1개, 실수 1개 입력받음");
	}
	
	void input(double a, int b) { // 매개변수 순서 다름
		System.out.println("실수 1개, 정수 1개 입력받음");
	}
	
	void input(int a, char b, double c) {
		System.out.println("정수 1개, 문자 1개, 실수 1개 입력받음");
	}
}
