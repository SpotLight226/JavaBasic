package day10.final_.basic;

import day10.static_.singleton.Person;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "홍길동");
//		p1.nation -"미국"; // final 변수 이므로 변경 불가
		System.out.println(p1.ssn);
		
		Person p2 = new Person("234234", "이순신");
		System.out.println(p2.ssn);
		
		// 상수의 사용 : static을 사용하는 것 처럼 사용한다
		System.out.println(Contant.O2);
	}
}
