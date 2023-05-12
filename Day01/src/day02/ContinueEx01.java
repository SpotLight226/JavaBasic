package day02;

public class ContinueEx01 {
	
	public static void main(String[] args) {
		
		// continue는 반복문을 건너뜀
		// for문에서는 증/감식으로 이동된다
		/*
		for(int i = 1; i <= 10; i++) {
			
			if(i == 5) {  // 5를 건너뜀
				continue; // 증감식으로 넘어간다
			}
			System.out.println(i);
		}
		*/
		
		// while문에서는 continue는 조건식으로 갑니다
		// 잘못 사용 시 무한루프
		int i = 1;
		while(i <= 10) {
			if(i == 5) {
				i++; // continue가 작동했을 때 i++를 실행하게 만들어서 작동할 수 있게 만듬
				continue; // 조건을 확인
			}
			System.out.println(i);
			
			i++;
		}
	}
}
