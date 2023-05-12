package day09.poly.basic2;

public class House {
	
	// 다형성 미적용 시
	private Student[] student = new Student[100]; 
	private Empolyee[] empolyee = new Empolyee[100];
	private Teacher[] teacher = new Teacher[100];
//	private int index1;
//	private int index2;
//	private int index3;
//	
//	public void inHouse(Student s) {
//		student[index1] = s;
//		index1++;
//	}
//	public void inHouse(Teacher t) {
//		teacher[index1] = t;
//		index2++;
//	}
//	public void inHouse(Employee e) {
//		empolyee[index1] = e;
//		index3++;
//	}
	
	// 다형성 사용시 쉽게 배열로 넣을 수 있다
	private Person[] person = new Person[100];
	private int index;
	
	public void inHouse(Person p) {  // person 배열에 값을 넣어주는 메서드
		person[index] = p;
		index++;
	}
//	
//	// 추가 -> 배열안에 들어있는 객체의 타입에 맞추어 출력
//	public void printHouse() {
//		
//		for(int i = 0; i<index; i++) { // 현재 6명이 들어가 있기에 현 index는 7 이다
//			
//			if(person[i] instanceof Student) {  // instanceof 활용
//				
//			}
//		}
//	}
	
	public void whoAreYou(Person p) {
		
		// true라면 p를 해당 타입으로 형변환해도 OK
		// 객체를 비교할 때도 쓸 수 있다
		if(p instanceof Student) { // student 라면 true
			System.out.println("너는 학생이다");
		} else if ( p instanceof Teacher) {
			System.out.println("너는 선생이다");
		} else if ( p instanceof Empolyee) {
			System.out.println("너는 직원이다");
		} else {
			System.out.println("너는 그냥 사람이다");
		}
	}
}
