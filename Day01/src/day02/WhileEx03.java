package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileEx03 {

	public static void main(String[] args) throws IOException {
		
		// 어떤 수를 입력받은 수가 (소수)인지 판별
		// 소수 - 나누어 떨어지는 수가 1과 자기자신인 수
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("판별할 소수를 입력>");
		int num = Integer.parseInt(bf.readLine());

		// 기본적인 조건
		
		int i = 2;
		while( num % i != 0) { // 소수는 자기 자신으로 나누어 0이 나올 때가지 while문 실행됨
			
			i++;
		}
		
		System.out.println(num == i ? num + "은 소수" : num + "은 소수가 아님");
	}
}
