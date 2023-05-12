package day01;

public class Variable {

	public static void main(String[] args) {
		
		/*
		 *  변수의 선언 방법
		 *  <데이터타입> 이름;
		 *  
		 *  int는 Integer의 약자로 정수를 저장하는 타입
		 */
		
		int num; // 선언만 해둠
		num = 10; // 변수 num을 10으로 초기화
		
		System.out.println(num);
		
		// 선언과 초기화를 동시에 
		int num2 = 20; // 변수 num2 선언하고 20으로 초기화
		
		// 같은 이름으로 변수를 생성할 수 없음
//		int num2 = 30; // 변수 이름이 같음
		
		// 언제든지 값을 바꿀 수 있음
		num2 = 40; // 변수 num2 값을 40으로 변경
		System.out.println(num2); // 40
		num2 = 50; // 변수 num2 값을 50으로 변경
		System.out.println(num2); // 50
		
		// 변수에는 다른 변수의 값, 또는 다른 연산한 결과도 저장할 수 있음
		int result = num + num2; // 
		result = num;  // 맨 마지막을 주의
		
		// 문자열 저장 - String에 저장
		String s = "홍길동";
		
		//?
		int result2 = num + 20; // 30 
		result2 = 100; // 100
		result2 = 10 + result2; //  110
		
	}
}
