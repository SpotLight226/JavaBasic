package day08.modi.member.pac1;

public class A {
	
	//사용
	A a = new A(); // public
	A a2 = new A(1); // default
	A a3 = new A("홍길동"); // private
	
	// 생성자
//	public A() { }  // 기본생성자 , 접근 제한 없음
	A(int i) { } // (default) 같은 패키지만 접근 가능
	private A(String s) { } // 같은 클래스만 접근 가능
	
	public A() {
		this.var1 = 1;
		this.var2 = 2;
		this.var3 = 3;
		
		method1();
		method2();
		method3();
	}
	
	//멤버변수 메서드
	 public int var1; // public - 접근 제한 없음
	        int var2; // ( default )
	private int var3; // private - 같은 클래스
	
	 public void method1() {} 
			void method2() {}
	private void method3() {}

}
