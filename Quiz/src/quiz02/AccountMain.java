package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account ac = new Account("홍길동", "1234", 50000);
		
//		ac.info();
		
		ac.deposit(10000); // 입급 - 잔고에 + 매개변수
		ac.withDraw(5000); // 출금 - 잔고에 - 매개변수
		int balance = ac.getBalance(); // 새로운 int변수에 return값을 받아준다
		System.out.println(balance); // 현 잔고
		
		ac.withDraw(60000);
//		ac.info();
	}
}
