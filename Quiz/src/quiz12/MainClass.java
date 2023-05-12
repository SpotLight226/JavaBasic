package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
	Radio r = new Radio(); // 300, LG
	Computer com = new Computer();
	Tv t = new Tv();
	
	MyCart c = new MyCart(10000);
	
	c.buy(t);
	c.buy(r);
	c.buy(com);
	}
}
