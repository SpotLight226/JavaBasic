package day11.trycatch;

public class ThrowsEx02 {
	
	public ThrowsEx02() throws Exception { // 예외 떠넘기기
		System.out.println("생성자 시작");
		aaa(); // 3. 예외 받음 -> 생성자 종료 -> 예외 떠넘김
		System.out.println("생성자 종료");
	}
	
	public void aaa() throws Exception { // 예외 떠넘기기
		System.out.println("aaa 시작");
		bbb(); // 2. 예외 받음 -> 메서드 종료 -> 예외 떠넘김
		System.out.println("aaa 종료");
	}
	
	public void bbb() throws Exception { // 예외 떠넘기기
		System.out.println("bbb 시작");
		
		System.out.println(10 / 0 ); // 1. 예외 발생!! -> 메서드 종료 -> 예외 떠넘김
//		try {
//			System.out.println(10 / 0);
//		} catch (Exception e) {
//			System.out.println("예외처리 끝");
//		}
		System.out.println("bbb 종료");
	}
	
	//main
	public static void main(String[] args) {
		
		// 4. 예외를 받아서 예외처리를 한 후 끝
		try {
			ThrowsEx02 ex = new ThrowsEx02();
		} catch (Exception e) {
			System.out.println("예외처리 끝");
		}
		
	}
}
