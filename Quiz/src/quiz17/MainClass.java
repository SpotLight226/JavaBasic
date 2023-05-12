package quiz17;

public class MainClass {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		try {
			c.input();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
