package day10.static_.method;

public class Count {
	
	public int a;        // 인스턴스 변수
	public static int b; // 클래스 변수
	
	// 일반 메서드 - 일반멤버와, static멤버 모두 사용 가능
	public int method01() {
		a = 10;
		b++;
		return b;
	}
	
	// static 메서드 - 일반 멤버(인스턴스 변수) 사용할 수 없음, static 멤버 사용 가능
//				   단, 객체생성을 통해서는 일반멤버 사용 가능
	public static int method02() {
//		a = 10; // 사용안되는 이유 - iv라서 사용 불가, static이 호출될 때 a변수가 없을 수도 있어서
		
		Count c = new Count(); // static메서드가 호출되면서 객체를 생성
		c.a = 10; // 객체 내의 a변수 사용 가능
		
		b++;
		return b;
	}
	// static 메서드는 실행시 자동으로 클래스 영역에 올라간다
}
	