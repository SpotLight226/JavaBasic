package quiz12;

public class Computer extends Product{

	//Computer는 생성자가 1개 있고, 가격은 500원, 이름은 마음대로
	public Computer() {
		super(500, "삼성"); // 부모의 생성자를 상속받아 설정 Product의 생성자 중 매개변수 2개를 받는
	}					   // 생성자의 형식에 맞게 super( , ) 를 사용한다
}
