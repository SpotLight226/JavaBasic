package day05;

public class ObjectBasic01 {
	
	public static void main(String[] args) {
		
		// 기존 사용방법
//		add(10); // 10이 누적이되어서 결과 10이 나옴
		System.out.println("=====1번 계산기=====");
		System.out.println(add(10));
		System.out.println(add(20));
		System.out.println(add(30));  // result = 60을 유지하면서 다른 계산기를 쓰고 싶을 때 -> 방법 없음
		
		System.out.println("=====2번 계산기=====");
		System.out.println(add2(100));
		System.out.println(add2(200));
		System.out.println(add2(300));
		
		
		
	}
	
	//1번 계산기
	static int result = 0;
	static int add(int a) { // 매개변수를 누적하는 메서드
		result += a;
		return result;
	}
	
	//2번 계산기 ( 다른 계산을 할 때마다 새로 만들어야 한다)
	static int result2 = 0; 
	static int add2(int a) { 
		result2 += a;
		return result2;
	}
}
