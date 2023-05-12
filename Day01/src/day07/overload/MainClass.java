package day07.overload;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic(); // 참조변수 b에 Basic객체의 주소값을 저장한다
		
		b.input(1);
		b.input("문자열");
		b.input(3, 3.14);
		b.input(3.14, 3);
		
	}
}
