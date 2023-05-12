package quiz06;

import java.util.Scanner;

public class MyAccount extends Account{
	/*
	   철수는 Account를 상속받는 나의계좌를 만드려고 한다.
	   기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.
	   
	   Account를 상속받고
	   withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
	   금액을 감소시키려고 한다.
	   또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
	   withDraw() 메서드를 오버라이딩 해주세요.
	   
	   */
	MyAccount() {} // 기본 생성자
	
	MyAccount (String a, String b, int c){ //3가지를 모두 받아서 초기화하는 생성자
		accountNumber = a;
		password = b;
		balance = c;
	}
	
	void withDraw(int j) {
		Scanner in = new Scanner(System.in);
		String pw = in.nextLine();
		
		if(password.equals(pw)) { // 문자열 비교시 .equals 사용 ( == 시 주소값만 비교한다)
			if(balance>j) {
				balance -= j;
				System.out.println("출금되었습니다");
			} else {
				System.out.println("잔고가 부족합니다 (잔고:" + balance + ")");
			}
		} else {
			System.out.println("비밀번호가 틀립니다");
		}
	}
	
}
