package quiz02;

public class Account {
	
	//한 사람의 은행 계좌
	/*
	 * accountNumber변수 - 식별아이디
	 * password변수 - 비밀번호
	 * balance변수 - 잔고
	 * 
	 * 생성자 - 멤버변수 초기화하는데 많이 사용
	 * 3가지를 모두 받아서 초기화하는 생성자
	 * 
	 * 메서드
	 * deposit(입금) : void - 잔고에 매개변수를 누적하는 기능
	 * withDraw : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int - 잔고를 리턴하는 기능
	 *
	 * 메인클래스에서는 각각의 기능을 확인
	 */
	
	String accountNumber;
	String password;
	int balance;
	
	Account(){ }// 기본 생성자
	
	Account(String a, String b, int c){ //3가지를 모두 받아서 초기화하는 생성자
		accountNumber = a;
		password = b;
		balance = c;
	}
	
//	void info() {
//		System.out.println("===정보===");
//		System.out.println("아이디: " + accountNumber);
//		System.out.println("비밀번호: " + password);
//		System.out.println("잔고: " + balance);
//	}
	
	void deposit(int i) { // 입급
		// 매개변수가 양수 일때만 가능하도록 변경
//		if(i<0) {
//			System.out.println("-금액을 입금할 수 없습니다");
//		} else {
//			balance += i;
//		}
		if(i>0) {
			balance += i;
		} else {
			System.out.println("입금이 0보다 작을 수는 없습니다");
		}
	}
	
	void withDraw(int i) { // 출금
		// 매개변수가 잔고보다 클 때만 출금이 가능하도록 변경
		if(balance>=i) {
			balance -= i;
		} else {
			System.out.println("잔고가 부족합니다 (잔고:" + balance + ")");
		}
	}
	
	int getBalance() {
		return balance;
	}
}
