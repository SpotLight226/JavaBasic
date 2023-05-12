package day12.api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		int r = (int)(Math.random() * 10) + 1; // 1~10까지 랜덤
		
		double d = Math.abs(-3.14); // 절대값
		System.out.println(d);
		
		double d2 = Math.ceil(3.14); // 올림 - 0.1만 있어도 올린다
		System.out.println(d2);
		
		double d3 = Math.floor(3.14); // 내림 - 주어진 값을 버림해서 반환
		System.out.println(d3);		  // 음수일 때 조심!!
		
		double d4 = Math.round(3.5);  // 반올림
		System.out.println(d4);
		
		int d5 = Math.max(3, 5); // 큰수 반환 (매개변수의 타입과 똑같은 타입으로 반환)
		System.out.println(d5);
		
		
	}
}
