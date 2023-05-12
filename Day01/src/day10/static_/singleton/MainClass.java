package day10.static_.singleton;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 디자인 패턴!!!
	
//		Singleton s = new Singleton(); //생성자를 private 선언 하였으므로 일반적으로 생성 불가
	
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		// static 객체이므로 모두 같다
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		// 마치 static 효과를 가진다
		System.out.println(s.getDomain());
		System.out.println(s1.getDomain());
		System.out.println(s2.getDomain());
	}
}
