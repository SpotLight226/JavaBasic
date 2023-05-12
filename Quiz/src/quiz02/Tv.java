package quiz02;

public class Tv {
	
	String company = "LG"; //회사
	int channel; //채널
	boolean power; //전원
	
	/*
	 * 메서드
	 * changeChannel : int - 매개변수 채널번 을 받아서 채널을 변경, 채널을 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜지고 동작될 수 있도록 
	 * 
	 */
	Tv(){ } // 기본 생성자
	
	int changeChannel(int i) {
		channel = i;
		return channel;
	}
	void channelDown() {
		channel--;
	}
	void channelUp() {
		channel++;
	}
	
	void power() {
		if(power == false) {
			power = true;
			System.out.println("전원이 켜졌습니다");
		} else {
			power = false;
			System.out.println("전원이 꺼졌습니다");
		}
	}
}
