package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// while에서 continue를 사용 시 사용 지점을 주의!!!

public class ContinueEx02 {

	public static void main(String[] args) throws IOException {
		
		//continue의 활용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 입력>");
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		int count = 0;
		x : for(int i = 1; i<=num; i++) {  
			
			count = 0;
			for(int j = 1; j <= i; j++) {
//				System.out.println(i + "-" + j); // ex) 3, 5, 7 
//				각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
//				적절한 시점 초기화...
				
				if(i%j == 0) {
					count++;
				}
				if( count > 2) 	continue x; // 약수 개수가 2개 초과라면 다음 수 확인
				
			} // end for
				if( count == 2 ){ // 소수를 sum에 누적
					sum += i;
				}
		}
			System.out.println("소수의 합 >" + sum);
	}
}
