package day05;

public class VarMain {

	public static void main(String[] args) {
		
		Variable var = new Variable(); // 객체 생성후 주소값을 참조변수 var에 저장
		
		var.a = 100; //멤버변수 : 외부에서 값변경
		var.b = "바꿔버릴꺼야";
		var.printNum(10); 
		
	}
}
