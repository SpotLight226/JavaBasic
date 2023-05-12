package day02;

public class MultiForEx02 {
	
	public static void main(String[] args) {
		
		/*
		 * 회전수가 변경되는 중첩반복문
		 * i값에 따라서 j의 값을 변경 
		 * 1 - 1바퀴
		 * 2 - 1
		 * 2 - 2
		 * 3 - 1
		 * 3 - 2
		 * 3 - 3
		 */
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= i; j++) { // i 값에 따라 j_for문 실행 횟수 변경
				System.out.println(i + "-" + j);
			}
		}
		
		// 별출력하기
		/*
		 * 
		 ** 
		 *** 
		 ****
		 *****
		 */
		
		//행
		for(int i = 1; i <= 5; i++) {
			//출력
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			} // 출력
			System.out.println(); // 줄 바꿈
		}
		
		System.out.println("------------------");
		
		/*
		        *   // 공백 : 8    i = 1 : j = 1,2,3,4
		  	   ***  // 6          i = 2 : j = 1,2,3
		      *****  // 4 	      i = 3 : j = 1,2    -> 5 - i = j
		     ******* // 2
		 	********* // 0
		 */
		int star = 15; // for문 변수화
		
		
		for(int i = 0; i<star; i++) {
			//공백
			for(int j = 0; j < star-i; j++) {
				System.out.print(" ");
			}
			// 별 출력						// i = 1 : j = 1   
			for(int j = 0; j < 2*i-1; j++) {	// i = 2 : j = 3
				System.out.print("*");      // i = 3 : j = 5
			}                               // i = 4 : j = 7
											// i = 5 : j = 9 -> 2*i-1 = j
			System.out.println();		    
		}
	}
}
