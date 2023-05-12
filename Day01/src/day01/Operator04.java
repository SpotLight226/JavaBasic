package day01;

public class Operator04 {

	public static void main(String[] args) {
		
		// 대입 연산자
		int a = 6;
		int b = 5;
		
		// 순서 조심
		a += 3; // a = a + 3  == 9
		b =+ 3; // b = +3
		
		System.out.println(a);
		System.out.println(b);
		
		a -= 4; // 5
		a *= 10; // 50
		a /= 5; // 10
		a %= 2; // 0
		
		// a ?
		System.out.println(a); // 0
	}
}
