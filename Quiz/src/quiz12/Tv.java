package quiz12;

public class Tv extends Product{

	//Tv는 생성자가 1개 있고, 가격은 400원, 이름은 마음대로
	public Tv() {
		super(400, "애플"); // 부모의 생성자를 상속받아 설정
	}
}
