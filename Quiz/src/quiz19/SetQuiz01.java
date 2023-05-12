package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 중복되지 않는 6자리 수 (로또 번호)
		 * 
		 * 1. Random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2. Set에 6개의 랜덤한 로또 번호를 저장한다
		 */
		 // TreeSet예제
		Set<Integer> set = new HashSet<>();
		Random ran = new Random();
		
		
		while(true) {
			int n = ran.nextInt(45) + 1; // 1~45
			set.add(n);
			
			if(set.size() == 6) break;
		}
		// 내꺼
//		while(set.size() != 6) {
//			int num = (int)((Math.random()*45)+1);
//			set.add(num);
//		}
		
		System.out.println(set.toString());
	}
}
