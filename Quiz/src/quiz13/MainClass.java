package quiz13;

public class MainClass {
	
	public static void main(String[] args) {
		
		Rect rect = new Rect("사각형", 4);
		System.out.println(rect.getArea());
		System.out.println(rect.getName());
		Circle circle = new Circle("원", 4);
		System.out.println(circle.getArea());
		System.out.println(circle.getName());
		System.out.println();
		
		System.out.println("==다형성 이용 Shape타입으로 사용==");
		Shape s1 = new Rect("사각", 5);
		System.out.println(s1.getName() + ", 너비: " + s1.getArea());
		Shape s2 = new Circle("둥글", 4);
		System.out.println(s2.getName() + ", 너비: " + s2.getArea());
		
		
		
	}
}
