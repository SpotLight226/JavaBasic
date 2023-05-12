package day07.this_;

public class Person {

	String name;
	int age;
	
	//겹치는 코드가 많으므로 this()를 사용하여 연결한다
	
	Person(String name, int age){ // 다른 사람이 봤을 때 알아보기 쉽도록 같은 변수 명 사용
		this.name = name;  // 변수 명이 같으므로 자신의 멤버변수라는 this. 을 붙인다
		this.age = age;
//		System.out.println(this); // 주소값 : 나 자신을 나타낸다
	}

	Person(String name) {
//		this.name = name;
//		this.age = 1;
//		System.out.println(this);
		this(name, 1);  // this() 를 사용하여 다른 생성자와 연결한다 (= 다른 생성자를 호출한다)
	}

	Person() {
//		this.name = "이름없음";
//		this.age = 1;
//		System.out.println(this);
		this("이름없음", 1);
	}

	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
}
