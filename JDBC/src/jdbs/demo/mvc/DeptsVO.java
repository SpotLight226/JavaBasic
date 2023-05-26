package jdbs.demo.mvc;

public class DeptsVO {

	//데이터베이스의 컬럼값을 가지고 다닐 클래스 -> 테이블마다 하나씩 테이블이 40개면 얘도 40개
		//만드는 규칙
		//1. 데이터베이스 컬럼을 멤버변수로 선언, 은닉한다
		//2. 생성자는 2개를 만든다
		//3. getter,setter를 활용한다
		
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	
	//생성자, alt shift s
	public DeptsVO() {
	}
	
	public DeptsVO(int department_id, String department_name, int manager_id, int location_id) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.manager_id = manager_id;
		this.location_id = location_id;
	}
	
	//getter, setter
	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	

	
	
}
