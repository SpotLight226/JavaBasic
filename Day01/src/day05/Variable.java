package day05;

public class Variable {
	
//	int a; // 선언
//	a=10; 클래스의 멤버변수는 선언만 가능하다 // 초기화를 하고 싶다면 메서드 안에서 해야한다
	
	int a =1; // 선언과 동시에 초기화는 가능함
//	int b; // 초기값 = 0
	String b; // 초기값 = null(자동 초기화)
	// 멤버변수는 클래스 밖에서 초기화하여 사용가능
	
	void printNum(int d) { //매개변수 d
		
		int c = 1; // 지역변수(lv) = 메서드 안에서만 사용가능
				   // 지역변수는 메서드 밖에서 설정불가
		System.out.println("멤버변수: " + a);
		System.out.println("멤버변수: " + b);
		System.out.println("지역변수: " + c); // 지역변수를 초기화해야만 사용이 가능하다
		System.out.println("지역변수(매개변수): " + d); // 매개변수는 메서드를 호출할 때 꼭 전달하므로 쓸 수 있다
	}
	
	
}
