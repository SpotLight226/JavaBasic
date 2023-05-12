package day15.api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx {
	
	public static void main(String[] args) {
		/*
		 * 문자를 써서 저장할 때는 2바이트 기반 클래스 FileWriter()를 사용한다
		 */
		
		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\file\\text.txt";
		
		// writer 도 Closeable를 상속받아서 향상된 try-catch문을 사용할 수 있다
		try (Writer fw = new FileWriter(path)){
			
			// \n 줄바꿈
			// \r 캐리지 리턴(맨앞으로 당기기)
			String str = "그만좀 자세요.\n\r그만 일어나.\n\r집에가야지";
			
			fw.write(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
