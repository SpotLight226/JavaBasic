package day10.static_.singleton;

public class Singleton {
	//팩토리메서드, 인터페이스패턴, 추상팩토리, 빌더패턴, 퍼사드 패턴 등등....
	
	//싱글톤 - 객체가 1개만 생성되도록 클래스를 설계하는 패턴
	
	//1. 나 자신의 객체를 1개 생성
	private static Singleton instance = new Singleton();  // static -> 단 한 개만 만들겠다
	
	//2. 객체를 직접 생성할 수 없도록 생성자를 private 선언
	private Singleton() { }
	
	//3. 외부에서 객체생성을 요구할 때, instance 를 반환함
	public static Singleton getInstance() {  // static -> 클래스명.메서드 로 instance를 받을 수 있다
		return instance;
	}
	
	private String domain = "www.aaa.com";
	
	public String getDomain() {
		return domain;
	}
}
