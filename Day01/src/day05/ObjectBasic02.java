package day05;

public class ObjectBasic02 {

	public static void main(String[] args) {
	
		Calculator cal1 = new Calculator(); // 참조변수 cal1이 가리키는 Calculator객체 생성
		System.out.println("=====1번 계산기=====");
		System.out.println(cal1.add(10)); // 참조변수 . (Calculator객체의 add메서드 사용)
		System.out.println(cal1.add(20));
		System.out.println(cal1.add(30));
		
		Calculator cal2 = new Calculator(); // 참조변수 cal2이 가리키는 Calculator객체 생성
		System.out.println("=====2번 계산기=====");
		System.out.println(cal2.add(100));
		System.out.println(cal2.add(200));
		System.out.println(cal2.add(300));
		
		//2개의 객체 생성
	}
}
