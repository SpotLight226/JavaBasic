package day01;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		// 자바의 입력
		// 1. 스캐너 객체 필요
		Scanner in = new Scanner(System.in); // import 자동 shift + ctrl + O
		
		//2. 스캐너가 가지고 있는 입력기능을 사용해서 데이터를 입력받음.
		System.out.print("이름을 입력하세요 > ");
		String name = in.next(); // 문자열을 받음
		
		System.out.print("나이를 입력하세요 > ");
		int age = in.nextInt(); // 정수를 받음
		
		System.out.print("신장은? >");
		double tall = in.nextDouble(); // 실수를 받음
		
		System.out.println("입력받은 이름 : " + name + ", 나이 : " + age + ", 신장 : " + tall);
		
		//3.스캐너 자원해제
		in.close();
	}
}
