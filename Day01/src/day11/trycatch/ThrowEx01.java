package day11.trycatch;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		
		try {
			int result = sum(-10);
			System.out.println(result);
		} catch (Exception e) {
//			System.out.println("예외가 발생하여 메서드가 강제 종료됨");
			String msg = e.getMessage(); // 예외 메시지를 문자열로 반환
			System.out.println(msg);
		}
	}
	
	
	public static int sum(int n) throws Exception { // 예외 발생시 메서드를 강제 종료 -> 예외를 떠넘김
		
		// 예외를 직접 생성해서 , 메서드를 종료할 때 사용할 수 있다
		if( n < 0 ) { // 0보다 작을 때
//			return; 무조건 return 문이 들어가야 함
			throw new Exception("0 이상의 값이어야 합니다"); // 예외를 생성할 때, 예외에서 사용되는 메시지를 전달 할 수 있다
		}
		int sum = 0;
		for(int i =1; i<=n; i++) { // 1부터 n까지 합계
			sum += i;
		}
		
		return sum;
	}
}
