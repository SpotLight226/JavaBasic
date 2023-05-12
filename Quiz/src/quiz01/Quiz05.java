package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BufferedReader 버전
public class Quiz05 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1.하나의 정수를 입력받습니다.
		 * 2.이 정수가 짝수인지, 홀수인지, 음수인지, 0인지 판별하는
		 *   프로그램 코드를 작성해봅시다
		 *   
		 * 3 -> 홀수
		 * 0 -> 0입니다
		 * -1 -> 음수
		 * 2 - 짝수
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수를 입력하세요 > ");
		
		int a = Integer.parseInt(br.readLine());
		
		if(a%2 != 0) {
			System.out.print("홀수");
			if(a >0 ) {
				System.out.print(" 양수 ");
			} else {
				System.out.print(" 음수 ");
			} 
		} else {
			System.out.print("짝수");
			if(a > 0 ) {
				System.out.println(" 양수");
			} else {
				System.out.println(" 음수");
			}
		}
		
	}
}
