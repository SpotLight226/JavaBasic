package day15.api.io.readwrite;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * 문자기반 파일을 읽어서 사용할 때는 FileReader클래스를 사용한다
		 * 2바이트 기반
		 */
		
		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\file\\text.txt";
		
		try ( Reader fr = new FileReader(path)){
			
			int result;
			while((result = fr.read()) != -1) { // 더이상 읽을 값이 없으면 -1 반환 
				System.out.print((char)result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
