package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 파일명을 입력을 받는다
		 * 
		 * 2. 입력받은 파일을 filecopy로 복사해서 옮겨준다
		 */
		
		Scanner in =new Scanner(System.in);
		
		System.out.print("파일명>");
		String name = in.next();
		
		String readpath = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\file\\" + name;
		String writepath = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\filecopy\\" + name;
		
		try ( InputStream is = new FileInputStream(readpath);
			  OutputStream out = new FileOutputStream(writepath)) {
				
			 byte[] arr = new byte[1024];
			 
			 int result;
			 while( (result = is.read(arr)) != -1){
				 out.write(arr, 0, result);
			 }
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
