package day09.poly.basic2;

public class Student extends Person{ // extends 상속받고자 하는 클래스 
	
	String studentId;

	Student(String name, int age, String studentId) {
//		super(); 생략되어 있음
//		this.name = name;
//		this.age = age;
		// 위의 3개를 합침
		super(name, age);  // 부모클래스의 생성자를 호출하여 변수 값을 저장한다
		this.studentId = studentId;
	}
	
	String info() { // 오버라이딩
		return super.info() + ", 학번: " + studentId; // super. 을 이용하여 부모클래스(Person)의 info메서드를 호출
	}
}
