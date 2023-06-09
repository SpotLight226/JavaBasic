package day15.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferdReaderUTF8 {
	
	public static void main(String[] args) {
		
		/*
		 * 인코딩 = 파일 or 텍스트문서가 저장될 때 => 컴퓨터가 아는 이진수 형태로 저장하는 형식
		 * 디코딩 = 컴퓨터가 아는 이진수 형태 => 인간이 알고있는 문자형식으로 변경
		 * 
		 * 인코딩 대표형식 
		 * 문자인코딩 : 보통 UTF-8 (유니코드) vs EUC-KR
		 * 파일인코딩 : Base64 (아스키코드)
		 * 
		 * 인코딩 형식이 다르면 텍스트가 깨진다
		 * 1. 파일 인코딩형식을 프로그램에서 다루는 인코딩형식으로 바꾼다
		 * 2. 파일을 읽어올 때, 읽어오는 인코딩형식을 지정해서 읽어온다
		 * 
		 * InputStreamReader = 1byte 기반 파일 => 2byte기반으로 변경
		 * 파일을 읽을 때 인코딩 형식을 같이 지정할 수 있다
		 * 
		 * 2가지 방법
		 * 1. 원본파일의 인코딩을 UTF-8로 변경
		 * 2. 파일의 인코딩형식이 다르면 (한글)이 깨지게 되는데, 인코딩을 동일한 형태로 맞춰서 가지고 오면 된다 -> 임시방편
		 * 
		 */
		
		String path = "C:\\Users\\wkdqh\\OneDrive\\바탕 화면\\course\\file\\exampleBufferd.txt";
		
//		InputStream fis = new FileInputStream(path);  // 1바이트 기반
//		// InputStreamReader는 1바이트 기반을 받을 수 있다
//		// 다형성으로 Reader타입 참조변수에 객체 주소 받을 수 있음
//		Reader rd = new InputStreamReader(fis, "UTF-8"); // 1바이트 기반 => 2바이트 형식으로 변경
//														 // (파일, "인코딩 형식")
//		
//		BufferedReader br = new BufferedReader(rd); // 2바이트 기반 빠른 읽기 - InputStream 바로 못 들어감
//													// InputStreamReader을 거쳐 2바이트로 변경 후 매개변수로
		// 위의 3줄을 한 줄로
//		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
		
		// EUC-KR 형식으로 읽어온다
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR")); ) {
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
