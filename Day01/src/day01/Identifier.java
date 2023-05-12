package day01;

public class Identifier {
	
	public static void main(String[] args) {
	
		int age = 27;
		int Age = 28;
		// 대, 소문자를 구분
		
		System.out.println(age); // 27
		System.out.println(Age); // 28
		
		// 숫자로 시작할 수 없음
//		int 4Num = 10;  // 에러 
		int num4 = 10;
		
		// 카멜 표기법
//		int phonenumber = 10; // 좋지 않음
		int phoneNumber = 10; // 카멜 표기법으로 표기
		
		// 키워드로는 이름을 지을 수 없음
		// int class = 10;
		
	}

}
