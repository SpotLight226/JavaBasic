package quiz04;

// 부모 클래스
public class Player {

	String name;
	int hp;
	int mp;
	
	void info() {
		System.out.println("케릭명:" + name);
		System.out.println("hp:" + hp);
		System.out.println("mp:" + mp);
	}
}
