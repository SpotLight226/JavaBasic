package quiz03;

public class DmbPhone extends Phone {
	//DmbPhone은 Phone클래스를 상속 받습니다. extends
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
		
	int channel;
	
	DmbPhone() {} // 기본 생성자 : 주의! 항상 만들어두기
	
	DmbPhone(String a, String b, int c){
		model = a;
		color = b;
		channel = c;
	}
	
	void turnOnDmb() {
		System.out.println("TV를 켭니다");
	}
	
	void changeChannel(int i) {
		channel = i;
		System.out.println(channel + "번");
	}

	void turnOffDmb() {
		System.out.println("TV를 끕니다");
	}
	
}
