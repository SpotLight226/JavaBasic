package day01;

public class Casting03 {
	
	public static void main(String[] args) {
		
		char c = 'C';
		int i = 2;
		
		// 1. 서로 다른 타입의 연산에서 큰 타입에 맞추어 자동 형변환
//		char cc = c + i; // int형 : i가 int형, c는 char형 자동으로 int로 형변환
		char cc = (char)(c + i);
		
		System.out.println(cc); // C 유니코드 67 + 2 -> 69 = E
		
		int ii = c + i;
		System.out.println(ii); // 69
		
		// 2. int형보다 작은 타입의 연산의 결과는 무조건 int
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2); // int보다 작은 타입 byte 연산의 결과 = int
		// 컴퓨터의 계산이 32bit, 64bit -> 사이즈 늘려서 자릿 수 맞춰서 계산하기 때문에 int
		System.out.println(b3);
		
		short s1 = 100;
		byte b = 10;
		short s2 = (short)(s1 + b); // 결과가 int형 -> short로 형변환
		System.out.println(s2);
		
		//크기의 기준이 int : 작은 타입은 int로, 큰 타입은 그 타입에 맞춰서 자동 형변환
		// 작은 타입의 연산의 결과는 무조건 int
		
		
		
	}
}
