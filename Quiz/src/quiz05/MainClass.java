package quiz05;

public class MainClass {

	public static void main(String[] args) {
		/* 요구사항
		 * Calculator를 부모클래스로 선언하세요.
		 * Calculator를 상속받는 Computer클래스 생성 합니다.
		 * 
		 * Calculator의 멤버변수 result, pi를 선언하세요
		 * Calculator의 메서드
		 * add(int) : void - result에 값을 누적시키는 기능
		 * sub(int) : void - result에 값을 차감시키는 기능
		 * circle(int) : int - pi를 이용해서 원의 넓이를 구하는 기능
		 * ------------------------------------------------------------------
		 * Computer 클래스의 메서드
		 * circle()메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
		 * rect(double) : double - 정사각형의 넓이 를 리턴
		 * rect(double, double) : double - 직사각형의 넓이 를 리턴
		 * rect(double, double, double) : double - 직육면체의 넓이 를 리턴
		 * 
		 * 
		 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
		 */
		
		Calculator cal = new Calculator();
		Computer com = new Computer();
		
		cal.result = 10;
		cal.pi =3.14d;
		cal.add(5); // 더하기
		System.out.println(cal.result);
		cal.sub(10); // 빼기
		System.out.println(cal.result);
		System.out.println(cal.circle(3)); // 원의 넓이
		
		com.result =10;
		com.add(5);
		System.out.println(com.result);
		com.sub(10);
		System.out.println(com.result);
		System.out.println(com.circle(5)); // 원의 넓이 ( 오버라이드)
		System.out.println(com.rect(5.4)); // 정사각형의 넓이
		System.out.println(com.rect(5.4, 3.4)); // 직사각형의 넓이
		System.out.println(com.rect(5.4, 7.2, 3.9)); // 직육면체의 넓이
		
		
		
		
		
	}
}
