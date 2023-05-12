package day09.poly.basic2;

public class Teacher extends Person{

	String subject;

	Teacher(String name, int age, String subject){
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.subject = subject;
	}
	
	String info() { // 오버라이딩
		return super.info() + ", 과목: " + subject;
	}
	
}
