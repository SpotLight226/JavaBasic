package day01;

public class DataType {
	
	public static void main(String[] args) {
		
		//정수형 타입
		byte a = 127; // byte 범위 -128 ~ 127
		byte a1 = -128;
		
		short b = 32767; // short 범위 -32768 ~ 32767 
		
		int c = 2147483647; // int 범위 대략 21억 정도
							// long타입 보다 큰 건 문자열로
		int c1 = -2147483648;
		
		long d = 123123123123123L; // L을 붙여서 long타입을 나타내야 함
		
		// 2진수, 8진수, 16진수
		
		int bin = 010; // 8진수는 앞에 0을 붙임 -> 8
		System.out.println("8진수 010은 : " + bin); // + 로 연결
		
		int bin2 = 0b111; // 2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은 : " + bin2);
		
		int hexa = 0xA9; // 16진수는 앞에 0x를 붙임
		System.out.println("16진수 A9는 : " + hexa);
		
		System.out.println("------------------------------");
		
		//실수형 타입
		float f1 = 3.14f; // float 타입 표시
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.1415927777f; // 7자리 까지 유효함
		System.out.println(f2);
		double d2 = 3.141597777777777;  // 15자리 까지 유효함 -> double이 기본형
		System.out.println(d2);
		
		System.out.println("------------------------------");
		
		// boolean 은 true나 false만 저장 가능
		boolean bool1 = true; 
		boolean bool2 = false; 
		
		System.out.println(bool1); // true
		System.out.println(bool2); // false
		
		
	
	}
}
