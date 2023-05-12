package day11.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {
	
	public static void main(String[] args) {
		// throws <예외>로 예외를 넘겨받음
		
		/*
		 * 메서드나 생성자에서 발생되는 예외를 호출문장으로 넘기는 키워드 : throws
		 * throws구문이 붙어있는 생성자 or 메서드는 예외처리를 대신 진행해야 한다
		 * 
		 * 즉, 예외처리를 강요할 때 사용된다
		 */
		try {
			greeting(10); 
			
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다");
			e.printStackTrace(); // 에러가 발생했을 때 에러로그를 확인하기 위해서 많이 사용
		}
		
		//throws의 예시
		try {
			Class.forName("#$@%$#@");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//throws의 생성자의 예시 : try-catch문으로 감싸서 처리를 한다
		try {
			new FileInputStream("@%#");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	private static String[] arr = {"Hello", "bye", "say good bye"};
	public static void greeting(int index) throws Exception { // index에 맞는 arr[index]를 출력하는 메서드
										  // throws <예외 이름>
//		try { 								메서드에서 예외처리
//			System.out.println(arr[index]); 
//		} catch (Exception e) {
//			
//		}
		
		System.out.println(arr[index]);
		System.out.println("프로그램 정상종료");
	}
}
