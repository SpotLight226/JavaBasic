package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz11 {

	public static void main(String[] args) throws IOException{
		
		/*
		 * 1. 정수를 입력을 받는다
		 * 2. 입력받은 수까지 약수의 합
		 * 
		 * 예시
		 * 입력수 10
		 * (1+2+5+10)
		 * 약수의 합 18
		 * 
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수를 입력하세요>");
		int num = Integer.parseInt(bf.readLine());
		
		int sum = 0;
		int i = 1;
		
		while(i <= num) {
			if(num % i == 0) { // num의 약수
				sum += i;
				}
			i++;
		}
		System.out.println("약수의 합 : " + sum);
	}

}
