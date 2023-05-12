package day01;

public class Casting02 {
	
	public static void main(String[] args) {
		
		// 강제 형변환 (변환 타입) 
		// 크기가 큰 타입을 작은 타입에 넣을 때는 (type) 캐스팅을 사용해서 명시적으로 변환해준다
		int i = 70;
		char c = (char)i; // Casting
		short s = (short)i;
		
		System.out.println(c); // F = 70 유니코드
		System.out.println(s); // 70
		
		float f = 3.14f;
		int k = (int)f;  // 정수형 int < 실수형 f
		
		System.out.println(k);
		
		// 주의할 점 - 타입변환시 값을 받을 수 없는 범위가 들어오면 잘려나간 (Trash) 값을 저장한다
		int a = 1000;
		byte b = (byte)a; 
		
		System.out.println(b); // -24 
		
		// 특이케이스 - 문자와 숫자 간에도 명시적 형변환이 들어간다
		char cc = 'A';
		short ss = (short)cc; // 같은 크기에도 형변환을 해주어야 한다
		
		System.out.println(ss);
		
		//
		
		
	}
}
