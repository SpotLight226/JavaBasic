package day08.encap.obj2;

public class Hotel {

	private Chef chef;
	private String name;
	
	//호텔은 생성될 때 외부에서 chef객체를 받는다
	public Hotel(Chef chef) { // 기본 생성자 : Chef 타입 객체를 매개변수로 받는다
		this.chef = chef;
	} // Chef 타입을 받아서 Chef 타입에 저장
	
	//setter
	public void setChef(Chef chef) { // 매개변수 Chef를 받아서 주소값 저장
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() { // Chef 타입을 내보내는 getter
		return chef;
	}
}
