package day08.encap.obj;

public class Hotel {
	
	// 초기화 : 첫번째
//	private Chef chef = new Chef(); // 접근제어자 + 타입 + 변수명
	private Chef chef;
	
	// 두번째
	public Hotel() {
//		this.chef = new Chef();
	}
	// chef의 getter / setter
	// 객체를 매개변수로 받는 모형!!! setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	// 객체를 반환하는 모형!!! getter
	public Chef getChef() {
		return chef;
	}
}
