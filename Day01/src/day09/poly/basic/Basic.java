package day09.poly.basic;

/*
 * 하나의 자바파일에 여러 클래스 선언 가능
 * 단, 파일명과 동일한 클래스가 있어야하고, 해당 클래스만 public 이어야 한다
 */
class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {

	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b; // 부모 타입 참조변수로 자손 타입 객체에 접근 OK
	A a2 = c;
	A a3 = d;
	A a4 = e;
	// 줄여서 쓰면
	A a5 = new B(); // B -> A 변환 
	
	//기본타입변수
	int x =1;
	double y = x; // int -> double 변환
	
	//Object타입 모든 클래스 저장 가능
	Object o1 = a;
	Object o2 = "문자열";
	Object o3 = 1;
	Object o4 = new B();
}
