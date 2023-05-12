package day01;

public class Operator03 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		
		if( x != 10 & ++y == 21) {  
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
			
		}
		
		System.out.println(" x값 : " + x);
		System.out.println(" y값 : " + y);
		
		if( x == 10 | ++y == 21) { 
			System.out.println("참 입니다");
		}else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println(" x값 : " + x);
		System.out.println(" y값 : " + y);
		
		System.out.println("-----------------------------");
		
		x = 10;
		y = 20;
		
		if( x != 10 && ++y == 21) { //AND - x != 10 (false) => false
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
			
		}
		// 값의 변화 없음 -> 앞이 false라 ++y 실행 X
		
		System.out.println(" x값 : " + x);
		System.out.println(" y값 : " + y);
		
		if( x == 10 || ++y == 21) {  // OR - x == 10(true) => true
			System.out.println("참 입니다");
		}else {
			System.out.println("거짓 입니다");
		}
		// 값의 변화 없음 -> 앞이 true라 ++y 실행 X
		
		System.out.println(" x값 : " + x);
		System.out.println(" y값 : " + y);
		
	}
}
