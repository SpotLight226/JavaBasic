package day05;

public class Phone {
	
	String model;
	String color;
	int price;
	// 국룰 : 멤버변수 아래에 생성자를 만든다
	
	// 생성자를 직접 생성하게 되면, JVM이 기본 생성자를 자동생성하지 않는다
	// 생성자가 하나 이상 있으면 기본 생성자는 자동으로 생성되지 않는다 ***** 기본 생성자 만드는 습관!!
	// 생성자는 반환유형이 없다 -> 클래스와 이름이 똑같음
	// 역할 - 멤버변수를 초기화하는 용도로 보통 사용됨
	Phone(){ // 기본 생성자
		System.out.println("생성자 호출!");
		model = "갤럭시";
		color = "검정색";
		price = 100000;
	}
	
	// 생성자는 여러개 선언할 수 있다
	// 단, 매개변수의 종류 or 개수가 달라야한다!!!
	Phone(String a) {
		model = a;
		color = "핑크색";
		price = 200000;
	}
	
	Phone(String a, String b){ // 모델, 색상
		model = a;
		color = b;
		price = 300000;
	}
	
	Phone(String a, int b){ // 모델, 가격
		model = a;
		color = "하얀색";
		price = b;
	}
	
	Phone(String a, String b, int c){
		model = a;
		color = b;
		price = c;
	}
	
	void info() {
		System.out.println("====폰의 정보====");
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}
}
