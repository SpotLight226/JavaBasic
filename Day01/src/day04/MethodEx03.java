package day04;

public class MethodEx03 {
	
	public static void main(String[] args) {
		
		/*
		 * return이란 
		 * 1. 메서드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용이 된다
		 *
		 * 3. 반환값(리턴)은 없을 수도 있다. void로 선언한다
		 * 4. void메서드도 return을 사용할 수 있다
		 * 		- 값을 돌려주지는 못하고, 종료의 의미로 사용가능
		 * 		- 끝까지 실행 시 return문 없어도 OK
		 * 		- 특정 조건에 실행 중지시 return 문을 입력
		 * 5. main도 return가능
		 * 
		 * 매개변수 지정 잘!, return 값 잘!
		 */
		
		// **** ()가 달려있는 것은 메서드다
//		System.out.println(add(1, 2));
		
		System.out.println(); // print 도 메서드
		
//		add( 값, 값) 즉,
		int result = add( add(1,  2), add(3, 5));  // 가장 안 쪽에 있는 것부터 확인하면 된다
		System.out.println("결과:" + result);	   // add ( 3, 8) ->result = 11
		
		// void형 메서드는 return이 없기 때문에 단순히 호출만 가능하다
//		System.out.println( sub() ); // sub()은 반환값이 없기에 error 발생
		sub(); 
		div(6, 2);
		
		noReturn("bye");
		noReturn("hello");
		
	} // main
	
	static int add(int a, int b) { // 매개변수 2개(a,b) 변수타입 int
		return a + b; // a+b를 반환하는 메서드
	}
	
	//반환이 없고, 매개변수도 없는 모형
	static void sub() { // 호출만 가능하고 리턴값은 없음
		System.out.println("5 - 3 = 2");
	}
	
	//반환이 없고, 매개변수는 있는 모형
	static void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b));
	}
	
	//
	static void noReturn(String s) {
		
		if(s.equals("hello")) { // 문자열 비교 -> <문자열 이름> . equals(문자열) 
			System.out.println("메서드를 종료합니다!");
			return; // 조건에 맞을 시 실행
		}
		System.out.println("hello를 전달해야 한다"); // 아닐시 이것
	}
	
}
