package day02;

public class MultaiForEx {

	public static void main(String[] args) {
		
		// 바깥 9, 안쪽 9
//		for(int i =0; i<10; i++) {
//			
//			for(int j = 0; j<10; j++) {
//				System.out.println(i + "-" + j);
//			}
//		}
		
		//  2~9단까지 구구단을 모두 출력
		
		for(int i = 2; i<10; i++) {
			System.out.println("구구단:" + i + "단");
			for(int j = 1; j<10; j++) {
				System.out.println(i+ " x " + j + " = " + i*j);
			}
			System.out.println("-------------------");
		}
	}
}
