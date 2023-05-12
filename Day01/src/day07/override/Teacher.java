package day07.override;

public class Teacher extends Person{

	String subject;
	
	String info() { // 오버라이드 
		return "이름: " + name + ", 나이: " + age + ", 과목: " + subject;
	}
	
}
