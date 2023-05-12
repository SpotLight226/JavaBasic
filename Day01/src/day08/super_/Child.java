package day08.super_;

public class Child extends Parents{  // 상속받음
	
	String me;
	
//	Child() { // 기본 생성자 : 컴파일러가 자동 생성
//		super(); // 부모의 기본 생성자가 없음
//	}
	
	// 부모 클래스의 기본생성자가 없을 때 해결 방안 2가지
	// 1. 부모 클래스의 기본 생성자를 만든다 : 이미 완성된 부모클래스 사용시 기본 생성자가 없다면
	// 2. 자식에서 super() 통해서 부모님의 생성자와 강제 연결한다
	
	Child(String me) {
		super("홍순자", "홍길동"); // !! 부모의 생성자를 호출해 강제 연결
//		super(); 위의 것을 작성하지 않을시 super()가 자동으로 추가됨
		this.me = me;
	}
	
}
