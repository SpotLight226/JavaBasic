package day14.api.io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream이다
		 * 2. 생성자 매개값으로 파일을 쓸 경로가 들어간다
		 * 3. io패키지 거의 모든 클래스들은 생성자에 throws가 있기 때문에
		 * 	  반드시 예외처리 문장안에서 사용한다
		 */
		
		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\file\\example.txt"; 
		
//		FileOutputStream out = new FileOutputStream(path); 
		try {
			OutputStream out = new FileOutputStream(path); // 다형성, 추상화를 이용해 조상타입 이용
			
			// 한 글자씩 씀
//			out.write(65); // A (유니코드)
//			out.write(66); // B
//			out.write(67); // C
			
			// 배열
//			byte[] arr = {65, 66, 67, 68, 69}; // 배열에 들어있는 데이터를 한번에 씀
//			out.write(arr);
			
			//
			String str = "한글~"; // 한글은 1byte기반으로 쓰기에 적합하지 않음
			
			byte[] arr = str.getBytes(); // 문자열을 바이트 배열로 변환
			out.write(arr);
			
			
			
			out.close(); // 자원 해제
			
		} catch (Exception e) { // 모든 예외 처리
			
			e.printStackTrace();
		} 
														
	}
}
