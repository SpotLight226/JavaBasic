package day09.poly.basic2;

public class MainClass {
	
	public static void main(String[] args) {
			
		Person p = new Person("이순신", 20);
		Student s1 = new Student("홍길동", 20, "123123");
		Student s2 = new Student("홍길자", 30, "456456");
		Teacher t1 = new Teacher("박찬호", 40, "야구");
		Teacher t2 = new Teacher("손흥민", 40, "축구");
		Empolyee e1 = new Empolyee("강감찬", 50, "역사부");
		
		// 만약 다형성을 쓰지 않았을 때
//		Student[] arr = {s1, s2}; // Student 타입만 들어가는 배열 -> 다른 타입의 참조변수는 못 들어간다
//		Teacher[] arr2 = {t1, t2};
		
		// 다형성을 사용할 때 
		// 부모타입을 활용한 배열의 다형성
		Person[] arr = {p, s1, s2, t1, t2, e1}; // 모든 타입의 조상인 Person배열에는 다 들어갈 수 있다
											    // Person으로 형변환이 된다
		for(Person person : arr) {
			System.out.println(person.info());
		}
		
		System.out.println("===================");
		
		House h = new House();
		// Person 배열이기때문에 에러가 발생하지 않는다
		h.inHouse(p);
		h.inHouse(s1);
		h.inHouse(s2);
		h.inHouse(t1);
		h.inHouse(t2);
		h.inHouse(e1);
		
		h.whoAreYou(p);
		h.whoAreYou(t1);
		h.whoAreYou(e1);
		h.whoAreYou(s1);
		
	}
	
	//메서드
	
}
