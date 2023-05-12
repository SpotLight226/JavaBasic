package day12.api.lang.object;

import java.io.PrintStream;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		
		Person p2 = new Person("홍길동");
		
		//equals
		// 객체의 name변수가 같다면 true반환 하도록 오버라이딩
		boolean bool = p.equals(p2);
		System.out.println(bool);
		
		//toString - 주소값을 문자열로 반환
		//toStirng메서드는 멤버변수 값을 출력하도록 오버라이딩 많이 사용됩니다
		System.out.println(p.toString());
		
		try {
			// 새로운 Person객체를 복사해서 반환
			Person clonePeople = (Person)p.clone();
			
			System.out.println(clonePeople.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//객체의 주소를 해시알고리즘을 통해 변경한 값을 반환
		int x = p.hashCode();
		System.out.println(x);
		
		PrintStream ps = System.out;
		ps.println("출력");
	}
}
