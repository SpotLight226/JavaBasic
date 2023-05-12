package day12.api.lang.object;

public class Person extends Object implements Cloneable { // extends Object는 생략 가능
	
	// 모든 클래스는 Object를 상속받는다
	
	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//오버라이딩
	// alt + shift + s / v
	
	@Override 
	public boolean equals(Object obj) {
		//멤버변수 name 값이 같다면 true반환
		
		if(obj instanceof Person) { // 형변환 가능한지 확인
			Person p = (Person)obj;
			
			if(p.getName() != null) { // 넘어온 obj객체의 name이 null이 아닐 때 
				if(p.getName().equals(this.name)) { // obj객체의 name과 내 객체의 name이 같을 때
					return true; // true반환
				}
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		//객체가 사라지는 시점에서 자동으로 실행
		System.out.println(this.name + "님이 소멸되었습니다");
	}
	
	/*
	 * 객체 복사 메서드
	 * clone()을 오버라이드 하면, 외부에서 사용이 가능해진다
	 * 클래스는 Cloneable인터페이스를 상속받아야 한다
	 */
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	
	
	
	
	
	
}
