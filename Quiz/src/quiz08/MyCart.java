package quiz08;

public class MyCart extends Cart {
	
	//1. 생성자는 money를 전달받고 money값 초기화, tv = 300, com =400, radio= 500;
	MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}
	//2. buy(), add(), info() 메서드 오버라이드
	/*
	 * 상품명 "tv", "com", "radio"
	 * 
	 * buy(상품명) 기능 
	 * 매개변수가 tv, com, radio라면 금액에서 상품가격을 차감하고, add()메서드를 실행합니다.
	 * 단, 올바른 상품이 아니거나, 금액이 부족할 경우에는 적절한 처리를 해주세요.
	 */
	void buy(String product) {
		
		switch (product) {
		case "tv":
			if(this.money < 300) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= 300;
			}
			break;
		case "com":
			if(this.money < 400) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= 400;
			}
			break;
		case "radio":
			if(this.money < 500) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= 500;
			}
			break;
		default:
			System.out.println("올바른 상품이 아닙니다");
			return;
		}
		
		add(product); //물품을 담는 함수로 전달
	}
	/*
	 * add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트배열로 옴겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	void add(String product) {

		if(i >= cart.length) { //기존 배열이 꽉 찬경우
			
			//2배인 배열
			String[] newCart = new String[cart.length * 2];
			//기존배열의 값을 복사
			for(int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			//기존배열을 변경
			cart = newCart;
			newCart = null; //삭제
		}
		cart[i] = product;
		i++;
	}
	/*
	 * info() 는
	 * cart배열에 담긴 물건 목록만 (null 제외) 출력해주세요.
	 * 
	 */
	
	void info() {
		String str = "[";
		for(int j = 0; j < i; j++) {
			str += cart[j] + " ";
		}
		str += "]";
		
		System.out.println(str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
