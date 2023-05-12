package day15.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {

	public static void main(String[] args) {

		/*
		 * BufferedReader는 입력에 대한 성능향상보조스트림 이다
		 * 
		 * Reader클래스와 같이 사용된다
		 * 
		 */
		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\file\\test.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path) ) ) {

		  //String str = br.readLine(); //한줄씩 읽음 - 없으면 null
			String result;

			while((result = br.readLine()) != null ) {
				System.out.println(result);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
