package day04;

public class MethodEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드는 생성과 호출이 있습니다.
		 * 메서드는 메서드안에서 생성 할 수 없습니다.
		 */
	
		System.out.println("1~10까지합:" + calSum() );
		System.out.println("1~10까지합:" + calSum() );
		System.out.println("1~10까지합:" + calSum() );
		
		int result = calSum();
		System.out.println("1~10까지합:" + result);
		
		
		String result2 = calSum2();
		System.out.println(result2);
		
		
		
	} //main
	
	//반환유형 이름()
	static int calSum() {
		
		//1~10까지 합
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum; //합계를 반환
		
	}
	
	//문자열 반환
	static String calSum2() {
		
		//A~Z문자열합
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		return str; //문자열 반환
	}
	
	
	
	
	
	
	
	
	
	
	

}
