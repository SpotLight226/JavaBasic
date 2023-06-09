package day15.api.ramda.basic;

public class Person {
	
	//일반 클래스 - 고차함수를 가지고 있는 클래스 // map(function)
	public void greeting(Say01 say01) { // 함수적 인터페이스를 매개변수로 받는다 : 익명 클래스를 받는다
		say01.hello(); // 대신실행 (이미 만들어져 있음)
	}
	
	public void greeting(Say02 say02) { // distinct()
		String result = say02.hello("greeting이 전달한 문자열", 1); // hello 메서드의 구현은 람다식 or 익명개체
		System.out.println("greeting return:" + result);
	}
	
	public void greeting(Say03 say03) { 
		boolean result =  say03.bye(3);
		System.out.println(result);
	}
}
