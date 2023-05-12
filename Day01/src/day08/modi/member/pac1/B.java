package day08.modi.member.pac1;

public class B {

	//사용
		A a = new A(); // public  OK
		A a2 = new A(1); // default  OK
//		A a3 = new A("홍길동"); // private  X - 같은 클래스만 사용 가능
		
		public B() {
			a.var1 = 1; // public OK- 제한 없음
			a.var2 = 2; // ( default ) OK- 같은 패키지
//			a.var3 = 3; // private X- 같은 클래스
			
			a.method1(); // public OK- 제한 없음
			a.method2(); // (default) OK- 같은 패키지
//			a.method3(); // private X- 같은 클래스
		}
}
