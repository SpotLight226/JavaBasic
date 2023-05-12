package day13.api.util.random;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
//		double d = Math.random();
		Random r = new Random(); // 필요시 Random객체 사용 
		
		double d = r.nextInt(); // 0~1.0미만 사이의 랜덤 실수를 반환
		System.out.println(d);
		
		int x = r.nextInt(); // 정수 범위의 랜덤 값 반환
		System.out.println(x);
		
		int y = r.nextInt(10); // 0 이상 10미만 정수
		System.out.println(y);
	}
}
