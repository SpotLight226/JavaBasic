package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForEx02 {

	public static void main(String[] args) throws IOException {
		
		//입력받은 정수가 소수인지 For문으로 판별
		// (소수의 특징은 약수의 개수가 2개다)
		// ex) x = 10 -> 약수의 개수를 세본다 -> 약수의 개수가 2개 = 소수
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수입력>");
		int num = Integer.parseInt(bf.readLine());
		
		int count = 0; // 합계변수 (카운트변수)
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) { // 약수
				count++;
			}
		}
		System.out.println(count == 2 ? num + "은 소수다" : num + "은 소수가 아니다");
	}
}
