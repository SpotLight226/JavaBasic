package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//** 입력과 반복
public class WhileEx04 {

	public static void main(String[] args) throws IOException{
		
		/*
		 * 입력을 받을 횟수를 지정
		 * 처음 5를 입력받으면
		 * 5번 입력받을 수 있도록 처리
		 * 
		 * 입력 받은 값들의 합
		 */
		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(bf.readLine());
		
		Scanner in = new Scanner(System.in); // 밖에서 한번
		System.out.print("반복 수>");
		int size = in.nextInt();
		
		int sum = 0; // 합계누적
		int a = 1;
		while(a <= size) {
			
			System.out.print(">");
			int x = in.nextInt();
			sum += x; // 입력받은 수를 합
			
			a++;
		}
		System.out.println("입력받은 수의 합계: " + sum);
		
	}
}
