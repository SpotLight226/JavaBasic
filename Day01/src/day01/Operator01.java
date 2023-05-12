package day01;

public class Operator01 {
	
	public static void main (String[] args) {
		
		// 부호연산자 +, -
		int i = -3;
		int j = -i; // j = 3
		
		// 증감연산자 ++, --
		int k = 1;
		int h = ++k; // 전위연산 - 먼저 값을 증가시키고, 마지막에 대입
		
		System.out.println("k는 : " + k); // 2
		System.out.println("h는 : " + h); // 2
		
		int x = 1;
		int y = x++; // 후위연산 - 대입을 먼저 하고, 자신을 증가
		
		System.out.println("x는 : " + x); // 2
		System.out.println("y는 : " + y); // 1 ( x = 2 )
		
		// 일반적인 표현
		x = 1;
		x++;
		++x;
		
		x = 1;
		System.out.println(++x); // 출력 전에 증가
		System.out.println(x++); // 출력하고 증가
		// x 는 3
		
		// ~연산자 ( 2진수를 반대로 )
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b + 1); // 10의 보수(더했을 때 0이 되는 수) = -10
		
		System.out.println("-------------------------------");
		
		// ! 논리연산자 - 부정의 의미
		boolean bool = !true;  // false
		System.out.println(bool); // false
		System.out.println(!bool); // true
		
		
		
		
		
	}
}
