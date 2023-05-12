package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {

		//사용
		A a = new A(); // public  OK - 접근 제어 제한 없음
//		A a2 = new A(1); // default  X - 같은 패키지
//		A a3 = new A("홍길동"); // private  X - 같은 클래스
		
		public C() {
			a.var1 = 1;  // public OK
//			a.var2 = 2;  // (default) X- 같은 패키지
//			a.var3 = 3;  // private X - 같은 클래스
			
			a.method1(); // public OK
//			a.method2(); // (default) X - 같은 패키지
//			a.method3(); // private X - 같은 클래스
			
		}
}
