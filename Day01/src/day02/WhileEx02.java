package day02;

import java.util.Scanner;

public class WhileEx02 {
	
	public static void main(String[] args) {
		
		// 반복문과 조건문
		// 짝수의 합을 구하는 반복문
		
		// 1~100까지 수 중에서 짝수의 합 => 100까지 반복 도중에 짝수일 때만 누적
	 /* int a = 1; 
		int sum = 0; // 누적할 변수
		
		while(a <= 100) { //  a가 1부터 100까지 돌아가는 반복문
			
			if(a%2 == 0) { // 특정조건 : a가 2로 나누었을 때 나머지가 0인 숫자 = 짝수
				sum += a; // sum = sum + a;
			}
			
			a++;
		}
		System.out.print("1~100까지 짝수의 합 : " + sum); */
		
		
		// 입력 N까지 짝수들의 합
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력>");
		int num = scn.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= num) { // num까지 회전
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1부터" + num + "까지 짝수의 합은 : " + sum);
		
	}
}
