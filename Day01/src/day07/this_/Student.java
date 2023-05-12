package day07.this_;

public class Student extends Person{ // extends 상속받고자 하는 클래스 
	
	String studentId;

	Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age + ", 학번: " + studentId;
	}
}
