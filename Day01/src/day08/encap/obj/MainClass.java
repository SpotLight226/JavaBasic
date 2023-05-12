package day08.encap.obj;

public class MainClass {
	
	public static void main(String[] args) {
		
		Hotel h = new Hotel(); // Hotel 객체 생성 참조변수 h
		
//		Chef c = h.getChef(); // Chef 타입을 반환하므로 Chef타입 참조변수 c 로 받는다
//							  // Hotel안에 있는 Chef를 꺼냄
//		c.cooking();
		
		//Chef를 생성해서 Hotel한테 전달
//		Chef chef = new Chef();
		h.setChef(new Chef()); // 이와 같이 쓸 수 있다
		
		Chef c = h.getChef();
		c.cooking();
		
		
	}
}
