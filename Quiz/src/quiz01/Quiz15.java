package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz15 {

	public static void main(String[] args) throws IOException{
		
		/*
		 * 1. 입력받은 수까지의 소수들의 합
		 * 입력 7
		 * -> 바깥반복문은 7까지 회전
		 * -> 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 입력>");
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		int count = 0;
		for(int i = 1; i<=num; i++) {  // ex) num = 5 -> 1,2,3,4,5
			
			for(int j = 1; j <= i; j++) {
//				System.out.println(i + "-" + j); // ex) 3, 5, 7 
//				각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
//				적절한 시전 초기화...
				if(i%j == 0) {
					count++;
				}
			}
				if( count == 2 ){
					sum += i;
				}
				count = 0;
		}
			System.out.println("소수의 합 >" + sum);
	}
		
}


