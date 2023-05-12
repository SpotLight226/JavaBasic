package day11.inter.basic;

public interface Inter1 {
	// public static final 자동으로 붙어서 상수취급
	int A = 10; // public static final 생략

	// 메서드를 선언하면 자동으로 추상메서드가 된다
	void method01(); // public abstract 생략

	// 인터페이스에는 static, default메서드 선언이 가능함
	public static void method3() {
		System.out.println("스테틱 메서드");
	}

	public default void method4() {
		System.out.println("디폴트 메서드");
	}
}
