package day09.poly.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); // 상속받은
		c.method02(); // 오버라이드 된
		c.method03(); // 내꺼
		
		System.out.println("==========다형성 적용 (형변환)==========");
		
		//Parent처럼 사용된다. 단, 자식의 오버라이드 된 메서드가 실행된다
		Parent p = c; // 현재 참조변수의 타입 확인
		p.method01();
		p.method02();
//		p.method03();
		
		// 연결된 인스턴스가 가장 중요!! -> 오버라이딩 된 메서드가 실행된다
		
		System.out.println(p); // parent타입
		System.out.println(c); // child타입
		System.out.println(p == c); // child로 생성된 자식의 객체는 원래 객체를 유지한다
		
		System.out.println("==========클래스 강제 형변환==========");
		// 원본이 child로 생성되었다면, 강제 형변환이 가능하다
		
		Parent pp = new Child();
		System.out.println(pp); // child원본
		
		Child cc =(Child)pp;  // 강제형변환 : 
		cc.method01();
		cc.method02();
		cc.method03();
		
		// 주의점
		
		Object obj = new Object();
		//Child ccc = (Child)obj; // runtime exception
		
		System.out.println("=========형변환의 또다른 예시==========");
		
		String str = "홍길동";
		Object o = str;
		String result = (String)o; // OK
	}
}
