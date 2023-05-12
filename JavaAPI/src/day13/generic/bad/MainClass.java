package day13.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Object형으로 선언하면 무엇이든 저장할 수 있지만,
		 * 그 값을 사용할 때, 알맞은 타입으로 반드시 형변환을 해야 한다
		 * 
		 * 잘못 형변환 시, 예외가 발생한다
		 */
		
		ABC abc = new ABC();
		abc.setObj("홍길동");
		
		// ABC에 저장된 요소의 타입을 알 수 없다
		Object name = (String)abc.getObj(); 
		System.out.println(name);
		
		// 객체 저장시
		ABC abc2 = new ABC();
		abc2.setObj(new Person()); // Person객체 저장
		
		Person p = (Person)abc2.getObj(); // (Person)으로 형변환해야 한다
	}
}
