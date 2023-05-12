package day02;

import java.util.Iterator;

public class EnhanceForEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		//향샹된 포문 - 배열같은 연속된 타입을 돌리기에 적합
		// for( 배열과 타입이 같은 변수 : 배열이름
		for( int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("--------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "금", "금"};
		
		for(String s : arr2) {
			System.out.println(s + "요일");
		}
		
		System.out.println("--------------");
		
		//이 값들의 합계와, 평균(실수형)을 출력
		int[] score = {50, 40, 30, 20, 10};
		int sum = 0;
		double val = 0;
		
		for(int a : score) {
			sum += a;
			val = sum / score.length; // 배열의 길이
		}
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + val);
		System.out.println("형변환 사용 >" + (double)sum / score.length);
	}
}
