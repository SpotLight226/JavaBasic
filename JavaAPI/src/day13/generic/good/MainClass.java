package day13.generic.good;

import day13.generic.bad.Person;

public class MainClass {
	
	public static void main(String[] args) {
		
//		ABC abc = new ABC();
		ABC<String> abc = new ABC<String>();
		
		abc.setT("홍길동");
		String name = abc.getT();
		
		// 생성자의 <>은 생략 가능
		ABC<Person> abc2 = new ABC<>();
		
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		ABC<Object> abc3 = new ABC<>();
		Object obj = abc3.getT();
		
		//제네릭타입은 윈시타입 X
		// Integer로 사용해야 한다
		ABC<Integer> abc4 = new ABC<>();
		Integer i = abc4.getT();
		
		///////////////////////////////////////////
		// n개의 매개변수를 사용할 수 있다 - 멀티 제네릭
		DEF<Integer, String> def = new DEF<>();
		
	}
}
