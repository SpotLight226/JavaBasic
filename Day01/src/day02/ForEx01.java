package day02;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0;  //합계변수
		
		for(int a = 1; a <= 10; a++) {
		
			sum += a;
			
		}
		System.out.println("합계: " + sum);
		
		System.out.println("--------------------");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}
	
}
