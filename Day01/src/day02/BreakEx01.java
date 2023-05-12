package day02;

public class BreakEx01 {
	
	public static void main(String[] args) {
		
//		for(int i = 1; i <= 10; i++) {
//			
//			if(i == 5) {
//				break;
//			}
//			System.out.println(i);
//			
//			if(i == 5) break;  : 이런 식으로도 쓸 수 있다
//		}
		
		/*
		 * 무한 반복문
		 * - 반복문의 횟수를 정확히 모를 때 사용한다
		 * - 자바는 while(true) 문장을 많이 사용한다
		 * - 특정 조건에서 탈출하는 형식으로 사용된다
		 */
		
		int i = 1;
				
		while(true) {
			
			System.out.println(i);
			
			if(i == 15) {
				System.out.println("그만!");
				break;
			}
			i++;
		}
	}

}
