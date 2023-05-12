package day08.encap.obj2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Chef c = new Chef();
		//사용하는 곳
		Hotel h = new Hotel(c);
		
//		// 위의 두 문장을 하나로 합친 것
//		// Hotel 객체를 생성하고 매개변수로 Chef타입 객체를 받음
//		Hotel h = new Hotel(new Chef()); 
		
		Chef chef = h.getChef(); // 반환유형 !!! ( 반환 / 입력 ) 
		System.out.println(c == chef); // true - Hotel 안의 Chef를 빼낸 것
		
		// 메서드 사용시 설명을 잘 읽자
		
		chef.cooking(); // chef안에 들어있는 기능
		
		
		
	} 
}
