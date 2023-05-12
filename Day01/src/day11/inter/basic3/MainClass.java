package day11.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		Printed pt = new LG(); // 인터페이스 타입으로 LG객체를 생성한다
		pt.print("hello world");
		pt.colorPrint("hello world2", "파란색");
		int result = pt.copy(5);
		
		pt = new Samsung(); // 인터페이스 타입이므로 samsung으로 형변환 가능
		
		pt.print("hello world");
		pt.colorPrint("hello world2", "빨간색");
		int result2 = pt.copy(5);
	}
}
