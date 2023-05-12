package day08.modi.protec.pac1;

public class B {
	
	A a = new A(); // 참조변수 a 선언하고 A 객체 생성후 주소값을 대입

	//생성자
	public B() {
		a.bool = true; // 같은 패키지이므로 OK
		a.method();    // 같은 패키지이므로 OK
	}
}
