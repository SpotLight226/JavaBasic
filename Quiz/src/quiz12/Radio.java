package quiz12;

public class Radio extends Product{
	
	//Radio는 생성자가 1개 있고, 가격은 300원, 이름은 마음대로
	public Radio() {
		super(300, "LG"); // 부모의 생성자를 상속받아 설정
	}
}
