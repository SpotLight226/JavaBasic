package day07.override;

public class Student extends Person{ // extends 상속받고자 하는 클래스 
	
	String studentId;
	
	String info() {
		return "이름: " + name + ", 나이: " + age + ", 학번: " + studentId;
	}
}
