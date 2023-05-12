package day10.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count(); // 일반 메서드 사용시, 객체 만들고 참조변수.메서드
		c.method01(); // 일반
		c.method02(); // static
		
		//static 메서드 사용
		Count.method02(); // 객체를 만들지 않아도 (클래스 이름.메서드)로 사용가능
		
		//main과 연관지어 생각 -> main은 static, method02도 static -> 같은 영역에 있음
		
		//static메서드의 사용예시
		Math.random(); // static 메서드
		Arrays.toString(new int[3]); // static 메서드
		Integer.parseInt("3"); // static 메서드
		String.valueOf(3); // static 메서드 : 다른 타입을 문자열로 바꿔줌
	}
}
