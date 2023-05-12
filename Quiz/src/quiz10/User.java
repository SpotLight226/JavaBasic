package quiz10;

public class User {

	private String name;
	private int rrn;
	private int age;
	
	public User() { // 기본 생성자
	}
	
	public User(String name, int rrn, int age) { // 멤버변수 초기화하는 생성자
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}
	
	// getter / setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	public int getRrn() {
		return rrn;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
