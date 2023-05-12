package quiz06;

public class MainClass {

	public static void main(String[] args) {
		MyAccount acc = new MyAccount("123-456", "1234", 1000);
		
		acc.deposit(1000); //입금
		acc.withDraw(500); //출금
		
		System.out.println(acc.getBalance());
		
	}
}
