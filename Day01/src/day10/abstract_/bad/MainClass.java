package day10.abstract_.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		SeoulStore s = new SeoulStore();
		s.apple();
		s.grape();
		s.melon(); // 오버라이딩을 하지 않았다
		s.orange();
	}
}
