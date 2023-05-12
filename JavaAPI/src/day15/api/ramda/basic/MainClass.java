package day15.api.ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		// 익명 클래스
		
//		new Car(); // 인터페이스이므로 객체 생성 불가
		
		// 선언과 생성을 동시에
		// car의 run을 사용할 때마다 매번 다른 기능으로 사용해야 한다면 => 익명클래스를 사용할 수 있다
		/*
		Car car = new Car() { // Car 타입으로 객체 선언 및 생성
			@Override
			public void run() {
				System.out.println("익명 개체로 생성된 car");
			}
		};
		car.run();
		
		Car car2 = new Car() { // 
			
			public void run() {
				System.out.println("다른 내용의 익명 객체로 car 생성");
			}
		};
		*/
		
		// 익명객체 표현 문법 => 람다 표현형식으로 사용 가능
		Person p = new Person();
		
		p.greeting( new Say01() {

			@Override
			public void hello() {
				System.out.println("핼로우 기능!");
			}
		});	
		
		// 람다 표현형식
		// Say01이 가지고 있는 hello()를 전달하는 모형 -> 구현부만 생각하면 된다
		// 메서드 이름 생략가능
		p.greeting(() -> { System.out.println("람다 헬로우!"); 	});
		
		// 문법 1 : 사용할 문장이 1줄 이라면 {} 생략가능
		p.greeting( () -> System.out.println("람다 헬로우!(중괄호 생략)") );
		
		// Say02의 익명개체
		p.greeting( new Say02() {
			@Override
			public String hello(String a, int b) {
				// 프로그래머가 작성한 내용
				return a+b; // 문자열로 반환
			}
		});
		// Say02를 람다식으로
		// 문법 2 - 람다의 매개변수는 타입이 생략
		//       - 프로그램 코드가 한줄이라면 return도 생략
		p.greeting( (a, b) ->  a+b ); // 매개변수 타입, {}중괄호, return -> 생략
		
		//greeting의 3번째 메서드에 전달되는 값이 짝수? 홀수인지 판별
		p.greeting( (a) -> (a%2 == 0) ? true : false );
			
	}
}
