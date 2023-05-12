package day10.static_.basic;

public class Init { // static 초기화
	
	public static int price = 1000;
	
	// 단 한번만 초기화한다
	static {
		System.out.println("단 한번 실행됨");
		price = 1000;
	}
}
