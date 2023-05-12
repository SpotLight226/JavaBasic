package day11.inter.basic;

public class MainClass {
	
	public static void main(String[] args) {
		Basic b = new Basic();
		b.method01(); // override
		b.method02(); // override
		b.method03(); // 내 것
		
		System.out.println("---------다형성 이용---------");
		
		//인터페이스도 데이터타입이 될 수 있다
		//Inter1  처넘만 사용된다
		Inter1 i1 = new Basic(); // 다형성 이용
		i1.method01();
//		i1.method02(); Inter1에는 method02() 없다
		
		System.out.println("---------다형성 이용---------");
		Inter2 i2 = new Basic();
//		i2.method01(); Inter2에는 method01() 없다 
		i2.method02();
		
		System.out.println("----------------------");
		
		//인터페이스에서도 클래스 캐스팅을 사용할 수 있다 (형변환)
		Basic bb = (Basic)i2;  // Inter2 타입을 Basic으로 변경 
		bb.method01();
		bb.method02();
		bb.method03();
		
		// static 메서드의 사용 ( 클래스 이름 . 메서드 )
		Inter1.method3(); 
		
		// default 메서드의 사용 - 인터페이스에 미리 만들어진 몸체를 가지고 있는 메서드
		bb.method4();
		
		
	}
}
