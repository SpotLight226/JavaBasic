package day04;

public class MethodEx07 {

	public static void main(String[] args) {
		
		// 메서드의 연쇄호출
		// 메서드 안에서는 메서드를 호출이 가능하다!!!
		// -> 동기적 방식
		
		test01();
		
		//메서드의 재귀 : 나 자신을 호출하는 방식
//		recursive(1);
		
		System.out.println( fac(5));
	}
	
	static void test01() {
		System.out.println("1번 메서드 실행");
		
		test02(); // 메서드 안에서 호출 가능
		
		System.out.println("1번 메서드 종료");
	}
	
	static void test02() {
		System.out.println("2번 메서드 실행");

		System.out.println("2번 메서드 종료");
	}
	
	static void recursive(int a) {
		
		// 함수의 재귀는 반드시 탈출의 조건이 있어야 한다
		//***메서드 안에 언젠가 중단할 수 있는 조건을 줘야한다
		if(a==10) return; // a가 10일 때 종료
		
		System.out.println(a + "호출");
		a++;
		
		recursive(a);
		
		System.out.println( fac(5));
	}
	
	static int fac(int a) {
		// 재귀를 이용한 팩토리얼
		if(a == 1) {
			return 1;
		}
		return a * fac(a-1);
		
		// a = 5 -> return = 5 * fac(4) -> 5 * (4 * fac(3)) -> 5 * (4 * (3 * fac(2))
		// -> 5 * (4 * (3 * (2 * fac(1)) -> 5 * (4 * (3 * (2 * 1)
	}
	
}
