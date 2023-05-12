package day09.poly.basic2;

public class Empolyee extends Person{

	String department;

	Empolyee(String name, int age, String department) {
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.department = department;
	}

	String info() { // 오버라이딩
		return super.info() + ", 부서: " + department;
	}

}
