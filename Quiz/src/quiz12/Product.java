package quiz12;

public class Product {
	
	// private 변수는 상속되지 않음
	private String name;
	private int price;
	
	public Product() {} // 기본생성자
	
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}

	// getter / setter를 상속받을 수 있게
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
