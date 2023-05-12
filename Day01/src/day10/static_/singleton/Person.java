package day10.static_.singleton;

public class Person {
	
	//final 변수는 반드시 초기화를 해야한다
	//생성자를 통한 초기화 or 직접 초기화
	public final String nation = "대한민국";  //초기화 필요
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
