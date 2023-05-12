package day15.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx2 {
	
	public static void main(String[] args) {
		/*
		 * flush() - 중간중간 파일을 즉시 쓰고 싶으면 flush()를 사용한다
		 * 
		 * bufferdwriter가 끝나면 자동으로 flush()가 호출된다
		 */
		
		Scanner in = new Scanner(System.in);
		
		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\file\\test2.txt";
		
		try (BufferedWriter bw = new BufferedWriter( new FileWriter(path, true) ) ) {
			
			System.out.print(">");
			String word1 = in.next();
			bw.write(word1);
			bw.flush(); // 버퍼에 있는 내용을 내보낸다
			
			System.out.print(">");
			String word2 = in.next();
			bw.write(word2);
			bw.flush(); // 버퍼에 있는 내용을 내보낸다
			
			System.out.println("파일출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
