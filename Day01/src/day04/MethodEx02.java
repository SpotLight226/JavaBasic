package day04;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수(parameter)
		 * 메서드가 전달받는 매개값
		 * 여러개받을 수도 있고, 받지 않을 수도 있습니다.
		 */
		
		int result = calSum(10);
		System.out.println("결과:" + result);
		
		int result2 = calSum(100);
		System.out.println("결과:" + result2);
		
		int result3 = calSum2(1, 2);
		System.out.println("결과:" + result3);
		
		String result4 = calSum3(5, "가"); // return값이 String 타입이므로 result도 String 타입
		System.out.println("결과:" + result4);
	} //main
	
	
	//1~매개변수 까지의 합계
	static int calSum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//매개변수를 2개 받음
	static int calSum2(int a, int b) {
		return a + b;
	}
	
	//간단한 실습 - 정수 문자열을 전달받는 String calSum3()
	
	static String calSum3 (int a, String s) {
		
		String str = "";
		for(int i = 1; i<=a; i++) {
			str += s;  // a번 String s를 중첩한다
		}
		return str;
	}
	
	
	
}
