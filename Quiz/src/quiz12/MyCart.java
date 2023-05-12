package quiz12;

public class MyCart {
	
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money; // 잔고
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0; // cart의 순서
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart() {} // 기본 생성자
	
	public MyCart(int money) { // 2번
		this.money = money;
	}
	/*
	 * 3. buy(상품들의 부모타입) : void
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고  add(상품) 메서드를 호출
     */ 
	
	public void buy(Product p) {  // 상품들의 부모타입을 매개변수로 하여 부모타입의 자식들을 다 매개변수로 활용가능

		if(this.money > p.getPrice()) {
			this.money -= p.getPrice();
			add(p);
		} else {
			System.out.println("금액부족");
			return;  // 금액 부족시 메서드 종료
		}
		
		// if( this.money < p.getPrice()){
//				System.out.println("금액부족");
//				return;
//			}
//			this.money -= p.getPrice();  // 상품가격 차감
//			add(p);						 // add메서드 호출
	}
	
	/*
	 * 4. add(상품들의 부모타입) : void
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트배열로 옴겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	private void add(Product p) {
		
		if(i >= cart.length) { // i = 카트의 순서 
			
			Product[] newCart = new Product[cart.length * 2];  // 2배 크기의 Cart 생성
			
			for(int j = 0; j<cart.length; j++) { // 새로운 Cart에 이전 Cart의 요소를 복사
				newCart[j] = cart[j];
			}
			
			cart = newCart;  // newCart의 주소값을 cart에 대입 -> 참조변수 cart로 newCart에 접근 가능
			newCart = null;  // newCart 초기화 
			
		}
		
		cart[i]= p; 
		i++;
		info();
	}
	
	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 
	 * 메인에서 buy메서드 실행해서 확인합니다.
	 * 
	 */
	public void info() {
		
		int sum = 0;
		String str = "";
		
		
		for(int j = 0; j<i; j++) { // i => 카트의 순서까지
			
//			Product p = cart[j];  // 참조변수의 주소값
			
			sum += cart[j].getPrice();
			str += cart[j].getName() + " "; 
		}
		System.out.println("총합 가격[" + sum + "]");
		System.out.println("목록[" + str + "]");
	}
	
	
	
}
