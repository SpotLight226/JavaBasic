package day08.modi.protec.pac2;

import day08.modi.protec.pac1.A;

public class D extends A {  // A클래스를 상속받음
	
		// protected : 같은 패키지 + 다른 패키지의 자손
	
	//protected는 상속관계에서 super를 통한 접근이 가능하다
	public D() {
		super();  // 생략되어 있음
		super.bool = true;  // super 를 사용하여 protected에 접근 가능
		super.method();
		
	}
	
	// override 가능
	protected void method() {
		
	}
	

}
